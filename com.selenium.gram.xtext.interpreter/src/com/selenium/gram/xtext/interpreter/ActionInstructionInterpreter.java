package com.selenium.gram.xtext.interpreter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
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
			if (action.getAction() instanceof ActionClick) {
				ActionClick act = (ActionClick) action.getAction();
				String value = act.getElement().replaceAll("'", "");
				value = value.replaceAll("\"", "");
				value = value.trim().toLowerCase();
				
				System.out.println("ActionClick - " + act.getType() + " - "	+ act.getElement());

				// *****************************
				// ---------- BUTTON -----------
				// *****************************
				if (act.getType().equals("button")) {

				}

				// *****************************
				// ----------- LINK ------------
				// *****************************
				else if (act.getType().equals("link")) {
					
					List<WebElement> elements = driver.findElements(By.cssSelector(("a")));
					boolean click = false;
					int i = 0;
					while (!click){
						if (i == elements.size()){
							throw new ActionInstructionException("ActionClick - No Link " + value + " in this page");
						} else {
							try {
								String str = elements.get(i).getText();
								if (str.toLowerCase().trim().contains(value)){	
									WebDriverWait wait = new WebDriverWait(driver, 5);
								    wait.until(ExpectedConditions.elementToBeClickable(elements.get(i)));
								    elements.get(i).click();
								    click = true;								
								} 
							} catch (Exception e){
								click = false;
							} finally {
								i ++;
							}
						}						
					}
				}

				// *****************************
				// ----------- IMAGE -----------
				// *****************************
				else if (act.getType().equals("image")) {
					List<WebElement> elements = driver.findElements(By.tagName("img"));
					
					boolean click = false;
					int i = 0;
					while (!click){
						if (i == elements.size()){
							throw new ActionInstructionException("ActionClick - No image " + value + " in this page");
						} else {
							try {
								// Get attribute to test
								String src = elements.get(i).getAttribute("src").trim().toLowerCase();
								String alt = elements.get(i).getAttribute("alt").trim().toLowerCase();
								String str = elements.get(i).getText().trim().toLowerCase();
								
								
								if (src.contains(value) || alt.contains(value) || str.contains(value)){	
									WebDriverWait wait = new WebDriverWait(driver, 5);
								    wait.until(ExpectedConditions.elementToBeClickable(elements.get(i)));
								    elements.get(i).click();
								    click = true;								
								} 
							} catch (Exception e){
								click = false;
							} finally {
								i ++;
							}
						}						
					}
					
				}

				else {
					throw new ActionInstructionException(
							"Undefined Type of Clickable element");
				}

				System.out.println("click finsihed");
			}

			else if (action.getAction() instanceof ActionOpen) {
				System.out.println("Open - ActionInstruction");

				ActionOpen act = (ActionOpen) action.getAction();
				driver.get(act.getUrl());

				System.out.println("J'ai fini l'action open");
			}

			else if (action.getAction() instanceof ActionCheck) {
				System.out.println("Check - ActionInstruction");
			}

			else if (action.getAction() instanceof ActionType) {
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
