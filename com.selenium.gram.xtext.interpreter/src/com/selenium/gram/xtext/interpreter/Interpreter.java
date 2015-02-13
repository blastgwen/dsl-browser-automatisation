package com.selenium.gram.xtext.interpreter;

import java.util.HashMap;
import java.util.Map;

import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.Subprocedure;

public class Interpreter {

	private Map<String, Subprocedure> subprocedures;
	
	private Map<String, Expression> variables = new HashMap<String, Expression>();
	
	public void execute(Model model) throws InterpretationException {
				
		System.out.println("---------- DEBUT INTERPRETER -------- ");
		
		subprocedures = new HashMap<String,Subprocedure>();
		for (Subprocedure sub : model.getSubs()) {
			subprocedures.put(sub.getHead().getName().getName(), sub);
		}
		
		for(Instruction ins : model.getMain()){
			this.executeInstruction(ins);
		}
	}
	
	private void executeInstruction(Instruction instruction) throws InterpretationException{
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
			
		}
		// Execute une boucle
		if(instruction instanceof Loop){
			
		}
		// Execute une action Selenium
		if(instruction instanceof ActionInstruction){
			
		}		
		// Execute une assignatio de variable
		if(instruction instanceof Assignation){
			
		}
	}
	
	
	private void executeFunction(FunctionReference ref){
		
	}
}
