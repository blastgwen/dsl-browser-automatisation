package com.selenium.gram.xtext.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sourceforge.htmlunit.corejs.javascript.ast.NumberLiteral;

import org.eclipse.ui.internal.commands.ElementReference;
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
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.VariableReference;

public class ActionInstructionInterpreter {

	public void execute(ActionInstruction action, Map<String, ExpressionValue> variables) {
		WebDriver driver = SeleniumDriver.getInstance().getDriver();

		try {
			/*
			 * Action CLICK
			 */
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
					List<WebElement> elements = new ArrayList<WebElement>();
					
					elements.addAll(driver.findElements(By.cssSelector("input[type='submit']")));					
					boolean click = false;
					int i = 0;
					while (!click){
						
						if (i != elements.size()){
							try {
								WebElement elem = elements.get(i);
								String str = elements.get(i).getText().trim().toLowerCase();
								String val = elements.get(i).getAttribute("value").trim().toLowerCase();
								if (str.contains(value) || val.contains(value)){	
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
						} else {
							elements = driver.findElements(By.tagName("button"));
					
							i = 0;								
							if (i != elements.size()){
								try {
									WebElement elem = elements.get(i);
									String str = elements.get(i).getText().trim().toLowerCase();
									if (str.contains(value)){	
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
								
							} else {
								elements = driver.findElements(By.cssSelector("input[type='button']"));
								
								i = 0;								
								if (i != elements.size()){
									try {
										WebElement elem = elements.get(i);
										String str = elements.get(i).getText().trim().toLowerCase();
										String val = elements.get(i).getAttribute("value").trim().toLowerCase();
										if (str.contains(value) || val.contains(value)){	
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
								else {
									throw new ActionInstructionException("ActionClick - No button " + value + " in this page");
								}
							}
						}
					}
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

			/*
			 * Action OPEN
			 */
			else if (action.getAction() instanceof ActionOpen) {
				System.out.println("Open - ActionInstruction");

				ActionOpen act = (ActionOpen) action.getAction();
				driver.get(act.getUrl());

				System.out.println("J'ai fini l'action open");
			}

			/*
			 * Action CHECK
			 */
			else if (action.getAction() instanceof ActionCheck) {
				System.out.println("Check - ActionInstruction");
			}

			/*
			 * Action TYPE
			 */
			else if (action.getAction() instanceof ActionType) {
				System.out.println("Type - ActionInstruction");
				ActionType act = (ActionType)action.getAction();
				
				List<WebElement> elements = new ArrayList<WebElement>();				
				elements.addAll(driver.findElements(By.cssSelector("input[type='text']")));	
				elements.addAll(driver.findElements(By.cssSelector("input[type='password']")));	
				
				boolean type = false;
				int i = 0;
				while (!type){
					
					if (i != elements.size()){
						try {
							WebElement elem = elements.get(i);
							
							String name = elem.getAttribute("name").trim().toLowerCase();
							String id = elem.getAttribute("id").trim().toLowerCase();
							String place = elem.getAttribute("placeholder").trim().toLowerCase();
							
							String value = act.getNameElement().replaceAll("'", "");
							value = value.replaceAll("\"", "");
							value = value.trim().toLowerCase();
							
							if (name.contains(value) || id.contains(value) || place.contains(value)){	
								elem.clear();
								
								if (act.getValue() instanceof NumLiteralExpression){
									NumLiteralExpression numLit = (NumLiteralExpression)act.getValue();
									elem.sendKeys(numLit.getValue().substring(1, numLit.getValue().length()-1));
								} 
								else if (act.getValue() instanceof VariableReference){
									VariableReference varRef = (VariableReference)act.getValue();
									
									if (variables.containsKey(varRef.getVarID().getName())){
										
										// TODO -> DONE : Evaluate the expression
										ExpressionValue exp = variables.get(varRef.getVarID().getName());
										
										elem.sendKeys(varRef.getVarID().getName());										
									}
									else 
										throw new ActionInstructionException("Undefined variable " + varRef.getVarID().getName());
								} 
								else if (act.getValue() instanceof BooleanExpression){
									BooleanExpression bool = (BooleanExpression)act.getValue();
									
									// TODO evaluate Expression
									elem.sendKeys("true");
									
								} else {
									throw new ActionInstructionException("Impossible to type this var in a textbox");
								}
								
							    type = true;								
							} 
						} catch (ActionInstructionException e){
							throw e;
						}
						catch (Exception e){
							type = false;
						} finally {
							i ++;
						}
					}
				}
			}

			else {
				throw new ActionInstructionException("Undefined ActionInstruction");
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
