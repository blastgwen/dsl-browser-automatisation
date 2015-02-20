package com.selenium.gram.xtext.interpreter;

import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;

public class ActionInstructionInterpreter {

	public void execute(ActionInstruction action){
		if (action.eClass().getName().equals(ActionClick.class.getSimpleName())){
			
		}
	}
}
