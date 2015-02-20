package com.selenium.gram.xtext.interpreter;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionExpression;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.ListExpression;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.VariableReference;
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
		
		for(Instruction ins : model.getMain()){
			this.executeInstruction(ins, variables);
		}
	}
	
	private void executeInstruction(Instruction instruction, Map<String, Expression> variables) throws InterpretationException{
		// Déclaration d'une variable
		System.out.println("execute instruction : " +instruction.eClass().getName());

		
		if(instruction.eClass().getName().equals(Definition.class.getSimpleName())){
			DefinitionImpl def = ((DefinitionImpl) instruction);

			if(def.getVarID() == null) throw new InterpretationException("pas de nom de variable");
			
			if(variables.containsKey(((Definition) instruction).getVarID().getName())){
				
				throw new InterpretationException(Definition.class.getName());
			}
			else {
				System.out.println("exec def : "+def.getVarID() + ", exp : "+def.getExp());
				variables.put(def.getVarID().getName(), def.getExp());
			}	
		}
		// Execute un appel de fonction
		if(instruction.eClass().getName().equals(FunctionReference.class.getSimpleName())){
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
		if(instruction.eClass().getName().equals(Conditional.class.getSimpleName())){
			System.out.println("execute cond");
			Conditional cond = (Conditional) instruction;
			
			if(this.getBooleanValue(cond.getExp())){
				for(Instruction condIns : cond.getTrueIns()){
					this.executeInstruction(condIns, variables);
				}
			}
			else{
				for(Instruction condIns : cond.getFalseIns()){
					this.executeInstruction(condIns, variables);
				}				
			}
		}
		
		// Execute une boucle
		if(instruction.eClass().getName().equals(Loop.class.getSimpleName())){
			System.out.println("execute boucle");
			Loop loop = (Loop) instruction;

			if(loop.getWhile() != null){
				System.out.println("execute while");
				this.executeWhile(loop.getWhile(), variables);
			}
			else{
				System.out.println("execute for");
				this.executeFor(loop.getFor(), variables);
			}
		}
		// Execute une action Selenium
		if(instruction.eClass().getName().equals(ActionInstruction.class.getSimpleName())){
			System.out.println("execute ActionInstruction : " + instruction.getClass().getName());
			new ActionInstructionInterpreter().execute((ActionInstruction) instruction);
		}		
		
		// Execute une assignatio de variable
		if(instruction.eClass().getName().equals(Assignation.class.getSimpleName())){
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
	
	private Object computeExpression(Expression exp, Map<String, Expression> variables) 
			throws InterpretationException{
		
		if(exp.eClass().getName().equals(VariableReference.class.getSimpleName())){
			VariableReference ref = (VariableReference) exp;
			if(variables.containsKey(ref.getVarID().getName())){
				return computeExpression(variables.get(ref.getVarID().getName()), variables);
			}
			else {
				throw new UnknownVariableException(ref.getVarID().getName());
			}
		}
		
		if(exp.eClass().getName().equals(NumLiteralExpression.class.getSimpleName())){
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
		
		if(exp.eClass().getName().equals(ListExpression.class.getSimpleName())){
			
		}
		
		if(exp.eClass().getName().equals(BooleanExpression.class.getSimpleName())){
				
		}
		
		if(exp.eClass().getName().equals(ActionExpression.class.getSimpleName())){
			
		}
		
		throw new InterpretationException("Expression inconnue : "+exp.eClass().getName());
	}
	
	
	private Boolean getBooleanValue(Expression exp){
		
		return false;
	}
	
	private void executeWhile(While whileInstruction, Map<String, Expression> variables) throws InterpretationException{
		while(this.getBooleanValue(whileInstruction.getCond())){
			for(Instruction ins : whileInstruction.getIns()){
				this.executeInstruction(ins, variables);
			}
		}
	}
	
	private void executeFor(Foreach forInstruction, Map<String, Expression> variables){
	
	}
}
