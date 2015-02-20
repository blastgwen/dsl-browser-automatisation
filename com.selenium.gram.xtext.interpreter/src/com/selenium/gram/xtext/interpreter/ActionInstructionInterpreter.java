package com.selenium.gram.xtext.interpreter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.gram.xtext.slnDsl.ActionCheck;
import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.ActionOpen;
import com.selenium.gram.xtext.slnDsl.ActionType;

public class ActionInstructionInterpreter {

	public void execute(ActionInstruction action) {
		WebDriver driver = SeleniumDriver.getInstance().getDriver();

		try {
			if (action.getAction().eClass().getName().equals(ActionClick.class.getSimpleName())) {
				ActionClick act = (ActionClick) action.getAction();
				String value = act.getElement().replaceAll("'", "");
				value = value.replaceAll("\"", "");
				value = value.trim().toLowerCase();
				
				System.out.println("ActionClick - " + act.getType() + " - "	+ act.getElement());

				if (act.getType().equals("button")) {

				}

				else if (act.getType().equals("link")) {
					
					List<WebElement> elements = driver.findElements(By.cssSelector(("a")));
					for (WebElement elem : elements){
						String str = elem.getText();
						if (str.toLowerCase().trim().contains(value)){
							WebDriverWait wait = new WebDriverWait(driver, 5);
						    wait.until(ExpectedConditions.elementToBeClickable(elem));
						    elem.click();
						    break;
						}
					}
					
					//WebElement element = driver.findElement(By.xpath("//a[contains(lower-case(text()), " + act.getElement().toLowerCase() + ")]"));
					//WebDriverWait wait = new WebDriverWait(driver, 5);
				    //wait.until(ExpectedConditions.elementToBeClickable(element));
				    //element.click();
				}

				else if (act.getType().equals("image")) {

				}

				else {
					throw new ActionInstructionException(
							"Undefined Type of Clickable element");
				}

				System.out.println("click finsihed");
			}

			else if (action.getAction().eClass().getName()
					.equals(ActionOpen.class.getSimpleName())) {
				System.out.println("Open - ActionInstruction");

				ActionOpen act = (ActionOpen) action.getAction();
				driver.get(act.getUrl());

				System.out.println("J'ai fini l'action open");
			}

			else if (action.getAction().eClass().getName()
					.equals(ActionCheck.class.getSimpleName())) {
				System.out.println("Check - ActionInstruction");
			}

			else if (action.getAction().eClass().getName()
					.equals(ActionType.class.getSimpleName())) {
				System.out.println("Type - ActionInstruction");
			}

			else {
				throw new ActionInstructionException(
						"Undefined ActionInstruction");
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
