package com.selenium.gram.xtext.interpreter;

import java.util.HashMap;
import java.util.Map;

import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.While;

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
		if(instruction instanceof Definition){
			System.out.println("execute def2");
			Definition def = (Definition) instruction;
			System.out.println("varial exp : "+def.getExp().getClass().getName());
			System.out.println("var name"+def.getVarID());
			if(variables.containsKey(def.getVarID().getName())){
				throw new InterpretationException(Definition.class.getName());
			}
			else {
				variables.put(def.getVarID().getName(), def.getExp());
			}		
		}
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
		if(instruction instanceof Loop){
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
		if(instruction instanceof ActionInstruction){
			new ActionInstructionInterpreter().execute((ActionInstruction) instruction);
		}		
		
		// Execute une assignatio de variable
		if(instruction instanceof Assignation){
			Assignation assign = (Assignation) instruction;
			
			if(variables.containsKey(assign.getVar().getVarID().getName())){
				variables.replace(assign.getVar().getVarID().getName(), assign.getExp());
			}
			else {
				throw new InterpretationException(Assignation.class.getName());
			}
		}
	}
	
	
	private void executeFunction(FunctionReference ref){
		
	}
	
	private Object computeExpression(Expression exp){
		
		
		return null;
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
