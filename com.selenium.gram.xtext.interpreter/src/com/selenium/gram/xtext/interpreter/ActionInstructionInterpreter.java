package com.selenium.gram.xtext.interpreter;

import org.openqa.selenium.WebDriver;

import com.selenium.gram.xtext.slnDsl.ActionCheck;
import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.ActionOpen;
import com.selenium.gram.xtext.slnDsl.ActionType;

public class ActionInstructionInterpreter {

	public void execute(ActionInstruction action) {
		if (action.getAction().eClass().getName().equals(ActionClick.class.getSimpleName())) {
			System.out.println("Click - ActionInstruction");			
		}

		else if (action.getAction().eClass().getName().equals(ActionOpen.class.getSimpleName())) {
			System.out.println("Open - ActionInstruction");
			
			try {
				ActionOpen act = (ActionOpen) action.getAction();
				SeleniumDriver sel = SeleniumDriver.getInstance();
				WebDriver driver = sel.getDriver();
				driver.get(act.getUrl());
				System.out.println("J'ai fini l'action open");
			} catch (Exception e){
				System.out.println(e);
			}
			
		}

		else if (action.getAction().eClass().getName().equals(ActionCheck.class.getSimpleName())) {
			System.out.println("Check - ActionInstruction");
		}
		
		else if (action.getAction().eClass().getName().equals(ActionType.class.getSimpleName())){
			System.out.println("Type - ActionInstruction");
		}
		
		else {
			throw new ActionInstructionException("Undefined ActionInstruction");
		}
	}
}
