package com.selenium.gram.xtext.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.gram.xtext.interpreter.exceptions.ActionInstructionException;
import com.selenium.gram.xtext.interpreter.exceptions.InterpretationException;
import com.selenium.gram.xtext.interpreter.exceptions.SeleniumDriverException;
import com.selenium.gram.xtext.interpreter.exceptions.UnknownVariableException;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression;
import com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression;
import com.selenium.gram.xtext.slnDsl.Body;
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.BooleanListExpression;
import com.selenium.gram.xtext.slnDsl.BooleanValue;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.ExistAction;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.ListExpression;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.NegationExpression;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.Uri;
import com.selenium.gram.xtext.slnDsl.VariableReference;
import com.selenium.gram.xtext.slnDsl.VerifyAction;
import com.selenium.gram.xtext.slnDsl.While;

public class Interpreter {

	private Map<String, Subprocedure> subprocedures;
	
	/***
	 * Lance l'interprétation du programme
	 * @param model
	 * @throws Exception
	 */
	public void execute(Model model) throws Exception {
				
		System.out.println("---------- DEBUT INTERPRETER -------- ");
		
		subprocedures = new HashMap<String,Subprocedure>();
		for (Subprocedure sub : model.getSubs()) {
			subprocedures.put(sub.getHead().getName().getName(), sub);
		}
		
		Map<String, ExpressionValue> variables = new HashMap<String, ExpressionValue>();
		
		try{
		SeleniumDriver.initializeDriver(model.getNavigator().getBrowser());
		
		executeBody(model.getBody(), variables);
		}
		catch(InterpretationException e){
			e.printStackTrace();
		}
		finally{
			SeleniumDriver.closeDriver();
		}
	}

	/***
	 * Execute le body du main ou d'une procédure
	 * @param body
	 * @param variables
	 * @throws Exception
	 */
	private void executeBody(Body body, Map<String, ExpressionValue> variables)
			throws Exception {
		
		for(Definition def : body.getDefs()){
			if(def.getVarID() == null) throw new InterpretationException("pas de nom de variable");
			
			if(variables.containsKey(def.getVarID().getName())){				
				throw new InterpretationException(Definition.class.getName());
			}
			else {
				System.out.println("exec def : "+def.getVarID() + ", exp : "+def.getExp());
				variables.put(def.getVarID().getName(), computeExpression(def.getExp(), variables));
			}	
		}
		
		for(Instruction ins : body.getInstructions()){
			this.executeInstruction(ins, variables);
		}
	}
	
	/***
	 * Execute une instruction
	 * @param instruction
	 * @param variables
	 * @throws Exception
	 */
	private void executeInstruction(Instruction instruction, Map<String, ExpressionValue> variables) throws Exception{
		// Déclaration d'une variable
		System.out.println("execute instruction : " +instruction.eClass().getName());

		// Execute un appel de fonction
		if(instruction instanceof FunctionCall){
			System.out.println("execute func call : " +instruction.eClass().getName());
			FunctionCall func = (FunctionCall) instruction;
			if(subprocedures.containsKey(func.getRef().getFunctionName().getName())){
				Subprocedure sub =subprocedures.get(func.getRef().getFunctionName().getName());
				
				Map<String, ExpressionValue> localVariables = new HashMap<String, ExpressionValue>();
				
				if(sub.getHead().getArgsID().size() != func.getArgs().size())
					throw new InterpretationException("Nombre d'argument(s) incorrect");	
				
				for(int i =0; i < sub.getHead().getArgsID().size(); i++){			
					localVariables.put(
							sub.getHead().getArgsID().get(i).getName(), 
							computeExpression(func.getArgs().get(i), variables));
				}
				this.executeBody(sub.getBody(), localVariables);
			}
			else{
				throw new InterpretationException(FunctionCall.class.getName());
			}
		}		
		
		// Execute une condition
		if(instruction instanceof Conditional){
			System.out.println("execute cond");
			Conditional cond = (Conditional) instruction;
			
			if(this.getBooleanValue(cond.getExp(), variables)){
				System.out.println("cond true");
				for(Instruction condIns : cond.getTrueIns()){
					this.executeInstruction(condIns, variables);
				}
			}
			else{
				System.out.println("cond false");
				for(Instruction condIns : cond.getFalseIns()){
					this.executeInstruction(condIns, variables);
				}				
			}
		}
		
		// Execute une boucle
		if(instruction instanceof While){
			System.out.println("execute boucle while");
			this.executeWhile((While) instruction, variables);
		}
		
		if(instruction instanceof Foreach){
			System.out.println("execute for");
			this.executeFor((Foreach) instruction, variables);
		}
		
		// Execute une action Selenium
		if(instruction instanceof ActionInstruction){
			System.out.println("execute ActionInstruction : " + instruction.getClass().getName());
			new ActionInstructionInterpreter().execute((ActionInstruction) instruction, variables, this);
		}		
		
		// Execute une assignatio de variable
		if(instruction instanceof Assignation){
			Assignation assign = (Assignation) instruction;
			
			if(variables.containsKey(assign.getVar().getVarID().getName())){
				System.out.println("exec assignation : "+assign.getVar() + ", exp : "+assign.getExp());
				variables.replace(assign.getVar().getVarID().getName(), computeExpression(assign.getExp(), variables));
			}
			else {
				throw new InterpretationException(Assignation.class.getName());
			}
		}		
	}
	
	/***
	 * Calcule la valeur d'une expression
	 * @param exp l'expression
	 * @param variables
	 * @return la valeur, avec le type
	 * @throws InterpretationException
	 * @throws SeleniumDriverException 
	 */
	public ExpressionValue computeExpression(Expression exp, Map<String, ExpressionValue> variables) 
			throws InterpretationException, SeleniumDriverException{
		
		if(exp instanceof VariableReference){
			VariableReference ref = (VariableReference) exp;
			if(variables.containsKey(ref.getVarID().getName())){
				return variables.get(ref.getVarID().getName());
			}
			else {
				throw new UnknownVariableException(ref.getVarID().getName());
			}
		}
		
		if(exp instanceof NumLiteralExpression){
			System.out.println("exec numLitExp");
			NumLiteralExpression val = ((NumLiteralExpression)exp);
			Integer result = null;
			try{
				result = Integer.parseInt(val.getValue());
			}
			catch(NumberFormatException e){}
			
			if(result != null){
				return new ExpressionValue(result, ExpressionValueType.numeric);
			}
			else{
				return new ExpressionValue(val.getValue().substring(1, val.getValue().length()-1), ExpressionValueType.literal);
			}
		}
		
		if(exp instanceof ListExpression){
			
		}
		
		if(exp instanceof Uri){
			return new ExpressionValue(((Uri) exp).getUrl(), ExpressionValueType.url);
		}
		
		if(exp instanceof BooleanExpression){
			System.out.println("exec expression bool");
			return new ExpressionValue(getBooleanValue((BooleanExpression) exp, variables), 
					ExpressionValueType.bool);
		}		
		
		throw new InterpretationException("Expression inconnue : "+exp.eClass().getName());
	}
	
	/***
	 * Renvois la valeur booléene d'une expression
	 * @param exp l'expression
	 * @param variables
	 * @return true ou false
	 * @throws InterpretationException
	 * @throws SeleniumDriverException 
	 */
	public Boolean getBooleanValue(BooleanExpression exp, Map<String, ExpressionValue> variables ) throws InterpretationException, SeleniumDriverException{
		EObject val = exp.getExp();
		System.out.println("get bool val");
		
		if(val instanceof BinaryBooleanExpression){
			System.out.println("exec binary exp");
			
			BinaryBooleanExpression bin = (BinaryBooleanExpression)val;
			ExpressionValue right = computeExpression(bin.getRight(), variables);
			ExpressionValue left = computeExpression(bin.getLeft(), variables);
			
			if(bin.getOp().equals("=="))
				return left.getValue().equals(right.getValue());
			else
				return compareValues(left, right, bin.getOp());			
		}
		
		if(val instanceof NegationExpression){
			System.out.println("exec negation");
			return !this.getBooleanValue(((NegationExpression) val).getNegation(), variables);
		}
		
		if(val instanceof BooleanValue){
			if(((BooleanValue) val).getValue().equals("true"))
				return true;
			if(((BooleanValue) val).getValue().equals("false"))
				return false;
			throw new InterpretationException("Valeur booléenne invalide");
		}
		
		if(val instanceof VerifyAction){
			System.out.println("exec VeriFyAction");
			VerifyAction act = (VerifyAction) val;
			
			ExpressionValue toTest = this.computeExpression(act.getNameElement(), variables);
			ExpressionValue value = this.computeExpression(act.getValue(), variables);
			
			if (act.getVerifyType().toString().equals("checkbox")){				
				
				if (value.getType() == ExpressionValueType.list){
					throw new InterpretationException("Impossible to verify a list");
				}
				
				if (toTest.getType() != ExpressionValueType.list){
					return doVerifyCheckbox(toTest.getValue().toString(), value);
				} else {
					// TODO : gerer les listes
					List<Boolean> res = new ArrayList<Boolean>();
					List<Object> list =  (List<Object>) toTest.getValue();
					for (Object obj : list) {
						res.add(doVerifyCheckbox(obj.toString(), value));
					}
					
					for (boolean bool : res) {
				        if (!bool)
				            return false;
				    }
				    return true;
				}
			}
			
			else if (act.getVerifyType().toString().equals("textbox")){
				if (value.getType() == ExpressionValueType.list){
					throw new InterpretationException("Impossible to verify a list");
				}
				
				if (toTest.getType() != ExpressionValueType.list){
					return doVerifyTextbox(toTest.getValue().toString(), value);
				} else {
					// TODO : gerer les listes
					List<Boolean> res = new ArrayList<Boolean>();
					List<Object> list =  (List<Object>) toTest.getValue();
					for (Object obj : list) {
						res.add(doVerifyTextbox(obj.toString(), value));
					}
					
					for (boolean bool : res) {
				        if (!bool)
				            return false;
				    }
				    return true;
				}
			}
			else {
				throw new InterpretationException("Unknown VerifyType: " + act.getVerifyType());
			}
		}
		
		if(val instanceof ExistAction){
			System.out.println("exec existAction");
			ExistAction act = (ExistAction) val;
			
			ExpressionValue toTest = this.computeExpression(act.getNameElement(), variables);
			WebDriver driver = SeleniumDriver.getInstance().getDriver();
			
			if (toTest.getType() == ExpressionValueType.list){
				throw new InterpretationException("Impossible to test with a list ");
			}
			String valueToTest = toTest.getValue().toString();
			
			List<WebElement> elements = new ArrayList<WebElement>();
			
			if (act.getSelect().equals("link")){
				
				elements.addAll(driver.findElements(By.cssSelector(("a"))));				
				int i = 0;
				while (i < elements.size()){
					String str = elements.get(i).getText();
					if (str.toLowerCase().trim().contains(valueToTest)){	
					    return true;								
					}	
					i ++;
				}
				return false;
			} 
			else if (act.getSelect().equals("button")){
				elements.addAll(driver.findElements(By.cssSelector("input[type='submit']")));
				
				int i = 0;
				while (i < elements.size()){
					WebElement elem = elements.get(i);
					String str = elem.getText().trim().toLowerCase();
					String valu = elem.getAttribute("value").trim().toLowerCase();
					if (str.contains(valueToTest) || valu.contains(valueToTest)){
						return true;
					}
					i ++;
				}
				return false;
				
			} else if (act.getSelect().equals("textbox")){
				elements.addAll(driver.findElements(By.cssSelector("input[type='text']")));	
				elements.addAll(driver.findElements(By.cssSelector("input[type='password']")));
				
				int i = 0;
				while (i < elements.size()){
					WebElement elem = elements.get(i);
					
					String name = elem.getAttribute("name").trim().toLowerCase();
					String id = elem.getAttribute("id").trim().toLowerCase();
					String place = elem.getAttribute("placeholder").trim().toLowerCase();					
					
					if (name.contains(valueToTest) || id.contains(valueToTest) || place.contains(valueToTest)){	
						return true;
					}
					i ++;
				}
				return false;
				
			}
			
			else if (act.getSelect().equals("checkbox")){
				elements.addAll(driver.findElements(By.cssSelector("input[type='checkbox']")));
				elements.addAll(driver.findElements(By.cssSelector("input[type='radio']")));
				
				int i = 0;
				while (i < elements.size()){
					WebElement elem = elements.get(i);
					
					String name = elements.get(i).getAttribute("name").trim().toLowerCase();
					String valu = elements.get(i).getAttribute("value").trim().toLowerCase();
					String str = elements.get(i).getText().trim().toLowerCase();
					
					if (name.contains(valueToTest) || valu.contains(valueToTest) || 	str.contains(valueToTest)){
						return true;
					}
					i ++;
				}
				return false;
				
			}
			else if (act.getSelect().equals("image")){
				elements.addAll(driver.findElements(By.tagName("img")));
				
				int i = 0;
				while (i < elements.size()){
					WebElement elem = elements.get(i);
					
					String src = elements.get(i).getAttribute("src").trim().toLowerCase();
					String alt = elements.get(i).getAttribute("alt").trim().toLowerCase();
					String str = elements.get(i).getText().trim().toLowerCase();					
					
					if (src.contains(valueToTest) || alt.contains(valueToTest) || str.contains(valueToTest)){	
						return true;
					}
					i ++;
				}
				return false;
			}
			else {
				throw new InterpretationException("Unknown Select Element type");
			}
		}
		
		if(val instanceof BooleanListExpression){
			
		}
		
		if(val instanceof BinaryLogicalExpression){
			BinaryLogicalExpression bin = (BinaryLogicalExpression) val;
			if(bin.getOp().equals("&&")){
				return getBooleanValue(bin.getLeft(), variables) && getBooleanValue(bin.getRight(), variables);
			}
			if(bin.getOp().equals("||")){
				return getBooleanValue(bin.getLeft(), variables) || getBooleanValue(bin.getRight(), variables);
			}
			throw new InterpretationException("Opérateur logique inconnu");
		}
		
		if(val instanceof VariableReference){
			VariableReference ref = (VariableReference)val;
			if(variables.containsKey(ref.getVarID().getName())){
				System.out.println("exec get bool variable : "+ref.getVarID());
				ExpressionValue expVar = variables.get(ref.getVarID().getName());
				
				if(expVar.getType().equals(ExpressionValueType.bool))
					return (Boolean) expVar.getValue();
				else 
					throw new InterpretationException("Variable "+ref.getVarID().getName()+" is not a boolean");
			}			
			throw new UnknownVariableException(ref.getVarID().getName());
		}
		
		throw new InterpretationException("Unknown BooleanExpression : "+exp.getExp());
	}

	/***
	 * Compare deux expressions, si elles sont numériques
	 * @param left expression de gauche
	 * @param right expression de droite
	 * @param op opérateur de comparaison
	 * @return le resultat de la comparaison
	 * @throws InterpretationException
	 */
	private Boolean compareValues(ExpressionValue left, ExpressionValue right, String op)
			throws InterpretationException {
		// Vérifie que les expression sont numériques
		if(right.getType() == ExpressionValueType.numeric
		&& left.getType() == ExpressionValueType.numeric)
		{
			if(op.equals("<"))
				return ((Integer) left.getValue()) < ((Integer)right.getValue());
			if(op.equals(">"))
				return ((Integer) left.getValue()) > ((Integer)right.getValue());
				
			throw new InterpretationException("Opérateur de comparaison inconnu");
		}
		else {
			throw new InterpretationException("Valeurs non comparables");
		}
	}
	
	private void executeWhile(While whileInstruction, Map<String, ExpressionValue> variables) throws Exception{
		while(this.getBooleanValue(whileInstruction.getCond(), variables)){
			for(Instruction ins : whileInstruction.getIns()){
				this.executeInstruction(ins, variables);
			}
		}
	}
	
	private void executeFor(Foreach forInstruction, Map<String, ExpressionValue> variables){
	
		Map<String,ExpressionValue> localVars = new HashMap<String, ExpressionValue>(variables);
	
		// TODO : récupérer le type list Selenium et :
		// 1) vérifier que c'est une liste
		// 2) parcourir la liste
	}
	
	private boolean doVerifyCheckbox(String valueToTest, ExpressionValue value) throws InterpretationException, SeleniumDriverException{
		WebDriver driver = SeleniumDriver.getInstance().getDriver();
		
		List<WebElement> elements = new ArrayList<WebElement>();
				
		elements.addAll(driver.findElements(By.cssSelector("input[type='checkbox']")));
		elements.addAll(driver.findElements(By.cssSelector("input[type='radio']")));
		
		Boolean bool;
		try {
			bool = Boolean.parseBoolean(value.getValue().toString());
		} catch (Exception e){
			throw new InterpretationException("Impossible to test if " + valueToTest + " is selected becauseof value: " + value.getValue().toString());
		}
		
		boolean verify = false;
		int i = 0;
		while (!verify){
			if (i == elements.size()){
				return false;
			} else {
				try {
					// Get attribute to test
					String name = elements.get(i).getAttribute("name").trim().toLowerCase();
					String val = elements.get(i).getAttribute("value").trim().toLowerCase();
					String str = elements.get(i).getText().trim().toLowerCase();
					
					if (name.contains(valueToTest) || val.contains(valueToTest) || 	str.contains(valueToTest)){
						boolean totest = elements.get(i).isSelected();
						System.out.println("Verify Checkbox - " + totest + " == " + bool);
						return  totest == bool;
					} 
				} catch (Exception e){
					verify = false;
				} finally {
					i ++;
				}
			}			
		}	
		return false;
	}
	
	private boolean doVerifyTextbox(String valueToTest, ExpressionValue value) throws InterpretationException, SeleniumDriverException{
		WebDriver driver = SeleniumDriver.getInstance().getDriver();
		
		List<WebElement> elements = new ArrayList<WebElement>();
				
		elements.addAll(driver.findElements(By.cssSelector("input[type='text']")));	
		elements.addAll(driver.findElements(By.cssSelector("input[type='password']")));	
		
		boolean verify = false;
		int i = 0;
		while (!verify){
			if (i == elements.size()){
				return false;
			} else {
				try {
					// Get attribute to test
					String name = elements.get(i).getAttribute("name").trim().toLowerCase();
					String val = elements.get(i).getAttribute("value").trim().toLowerCase();
					String str = elements.get(i).getText().trim().toLowerCase();
					
					if (name.contains(valueToTest) || val.contains(valueToTest) || 	str.contains(valueToTest)){
						System.out.println("Verify TextBox - " + elements.get(i).getText() + " == " + value.getValue().toString());
						return elements.get(i).getAttribute("value").equals(value.getValue().toString());
					} 
				} catch (Exception e){
					verify = false;
				} finally {
					i ++;
				}
			}			
		}	
		return false;
	}
}
