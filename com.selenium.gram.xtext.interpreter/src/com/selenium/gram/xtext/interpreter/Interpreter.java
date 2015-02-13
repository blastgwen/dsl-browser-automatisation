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
		if(instruction instanceof Definition){
			Definition def = (Definition) instruction;
			if(variables.containsKey(def.getVarID().getName())){
				throw new InterpretationException(Definition.class.getName());
			}
			else {
				variables.put(def.getVarID().getName(), def.getExp());
			}		
		}
		// Execute un appel de fonction
		if(instruction instanceof FunctionReference){
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
			Loop loop = (Loop) instruction;

			if(loop.getWhile() != null){
				this.executeWhile(loop.getWhile());
			}
			else{
				this.executeFor(loop.getFor());
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
	
	private Boolean getBooleanValue(Expression exp){
		
		return false;
	}
	
	private void executeWhile(While whileInstruction){
		
	}
	
	private void executeFor(Foreach forInstruction){
		
	}
}
