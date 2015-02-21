package com.selenium.gram.xtext.interpreter;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression;
import com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression;
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.BooleanListExpression;
import com.selenium.gram.xtext.slnDsl.BooleanValue;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.ExistAction;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.ListExpression;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.NegationExpression;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.VariableReference;
import com.selenium.gram.xtext.slnDsl.VerifyAction;
import com.selenium.gram.xtext.slnDsl.While;
import com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl;

public class Interpreter {

	private Map<String, Subprocedure> subprocedures;
	
	
	public void execute(Model model) throws InterpretationException {
				
		System.out.println("---------- DEBUT INTERPRETER -------- ");
		
		subprocedures = new HashMap<String,Subprocedure>();
		for (Subprocedure sub : model.getSubs()) {
			subprocedures.put(sub.getHead().getName().getName(), sub);
		}
		
		Map<String, Expression> variables = new HashMap<String, Expression>();
		
		for(Definition def : model.getDefs()){
			if(def.getVarID() == null) throw new InterpretationException("pas de nom de variable");
			
			if(variables.containsKey(def.getVarID().getName())){				
				throw new InterpretationException(Definition.class.getName());
			}
			else {
				System.out.println("exec def : "+def.getVarID() + ", exp : "+def.getExp());
				variables.put(def.getVarID().getName(), def.getExp());
			}	
		}
		
		for(Instruction ins : model.getMain()){
			this.executeInstruction(ins, variables);
		}
	}
	
	private void executeInstruction(Instruction instruction, Map<String, Expression> variables) throws InterpretationException{
		// Déclaration d'une variable
		System.out.println("execute instruction : " +instruction.eClass().getName());

		// Execute un appel de fonction
		if(instruction instanceof FunctionReference){
			System.out.println("execute func call : " +instruction.eClass().getName());
			FunctionReference func = (FunctionReference) instruction;
			if(subprocedures.containsKey(func.getFunctionName().getName())){
				this.executeFunction(func);
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
			new ActionInstructionInterpreter().execute((ActionInstruction) instruction);
		}		
		
		// Execute une assignatio de variable
		if(instruction instanceof Assignation){
			Assignation assign = (Assignation) instruction;
			
			if(variables.containsKey(assign.getVar().getVarID().getName())){
				System.out.println("exec assignation : "+assign.getVar() + ", exp : "+assign.getExp());
				variables.replace(assign.getVar().getVarID().getName(), assign.getExp());
			}
			else {
				throw new InterpretationException(Assignation.class.getName());
			}
		}		
	}
	
	
	private void executeFunction(FunctionReference ref){
		
	}
	
	private ExpressionValue computeExpression(Expression exp, Map<String, Expression> variables) 
			throws InterpretationException{
		
		if(exp instanceof VariableReference){
			VariableReference ref = (VariableReference) exp;
			if(variables.containsKey(ref.getVarID().getName())){
				return computeExpression(variables.get(ref.getVarID().getName()), variables);
			}
			else {
				throw new UnknownVariableException(ref.getVarID().getName());
			}
		}
		
		if(exp instanceof NumLiteralExpression){
			NumLiteralExpression val = ((NumLiteralExpression)exp);
			Double result = null;
			try{
				Double.parseDouble(val.getValue());
			}
			catch(NumberFormatException e){}
			
			ExpressionValueType type = ExpressionValueType.literal;
			if(result != null){
				type = ExpressionValueType.numeric;
			}
		}
		
		if(exp instanceof ListExpression){
			
		}
		
		if(exp instanceof BooleanExpression){
			System.out.println("exec expression bool");
			return new ExpressionValue(getBooleanValue((BooleanExpression) ((BooleanExpression) exp).getExp(), variables), 
					ExpressionValueType.bool);
		}
		
		
		throw new InterpretationException("Expression inconnue : "+exp.eClass().getName());
	}
	
	
	private Boolean getBooleanValue(BooleanExpression exp, Map<String, Expression> variables ) throws InterpretationException{
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
			return ((BooleanValue) val).getValue().equals("true");
		}
		
		if(val instanceof VerifyAction){
			
		}
		
		if(val instanceof ExistAction){
			
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
		}
		
		if(val instanceof VariableReference){
			VariableReference ref = (VariableReference)val;
			if(variables.containsKey(ref.getVarID().getName())){
				System.out.println("exec get bool variable : "+ref.getVarID());
				Expression expVar = variables.get(ref.getVarID().getName());
				
				if(expVar instanceof BooleanExpression)
					return getBooleanValue((BooleanExpression) expVar, variables);
				else 
					throw new InterpretationException("Variable "+ref.getVarID().getName()+" is not a boolean");
			}			
			throw new UnknownVariableException(ref.getVarID().getName());
		}
		
		throw new InterpretationException("Unknown BooleanExpression : "+exp.getExp());
	}

	private Boolean compareValues(ExpressionValue left, ExpressionValue right, String op)
			throws InterpretationException {
		if(right.getType() == ExpressionValueType.numeric
		&& left.getType() == ExpressionValueType.numeric)
		{
			if(op.equals("<"))
				return ((Integer) left.getValue()) < ((Integer)right.getValue());
			else
				return ((Integer) left.getValue()) > ((Integer)right.getValue());
		}
		else {
			throw new InterpretationException("Valeurs non comparables");
		}
	}
	
	private void executeWhile(While whileInstruction, Map<String, Expression> variables) throws InterpretationException{
		while(this.getBooleanValue(whileInstruction.getCond(), variables)){
			for(Instruction ins : whileInstruction.getIns()){
				this.executeInstruction(ins, variables);
			}
		}
	}
	
	private void executeFor(Foreach forInstruction, Map<String, Expression> variables){
	
	}
	
	
}
