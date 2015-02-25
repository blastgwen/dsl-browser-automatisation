package com.selenium.gram.xtext.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.gram.xtext.interpreter.exceptions.ActionInstructionException;
import com.selenium.gram.xtext.interpreter.exceptions.SeleniumDriverException;
import com.selenium.gram.xtext.slnDsl.ActionCheck;
import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.ActionOpen;
import com.selenium.gram.xtext.slnDsl.ActionType;
import com.selenium.gram.xtext.slnDsl.GetAction;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.SelectAction;
import com.selenium.gram.xtext.slnDsl.VariableReference;

public class ActionInstructionInterpreter {

	public void execute(ActionInstruction action, Map<String, ExpressionValue> variables, Interpreter interpreter) throws Exception {
		WebDriver driver = SeleniumDriver.getInstance().getDriver();

		try {
			/*
			 * Action CLICK
			 */
			if (action.getAction() instanceof ActionClick) {
				
				ActionClick act = (ActionClick) action.getAction();
				
				ExpressionValue valueToTest = (ExpressionValue) interpreter.computeExpression(act.getElement(), variables);
				
				if (valueToTest.getType() == ExpressionValueType.list){
					throw new ActionInstructionException("Impossible to click on a list expression");
				}
				
				String value = valueToTest.getValue().toString();				
								
				System.out.println("ActionClick - " + act.getType() + " - "	+ value);

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
								String str = elem.getText().trim().toLowerCase();
								String val = elem.getAttribute("value").trim().toLowerCase();
								String id = elements.get(i).getAttribute("id").trim().toLowerCase();
								
								if (str.contains(value) || val.contains(value) || id.contains(value)){	
									WebDriverWait wait = new WebDriverWait(driver, 5);
								    wait.until(ExpectedConditions.elementToBeClickable(elem));
								    elem.click();
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
									String str = elem.getText().trim().toLowerCase();
									if (str.contains(value)){	
										WebDriverWait wait = new WebDriverWait(driver, 5);
									    wait.until(ExpectedConditions.elementToBeClickable(elem));
									    elem.click();
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
										String str = elem.getText().trim().toLowerCase();
										String id = elem.getAttribute("id").trim().toLowerCase();
										String val = elem.getAttribute("value").trim().toLowerCase();
										if (str.contains(value) || val.contains(value) || id.contains(value)){	
											WebDriverWait wait = new WebDriverWait(driver, 5);
										    wait.until(ExpectedConditions.elementToBeClickable(elem));
										    elem.click();
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
					List<WebElement> elements = new ArrayList<WebElement>();
					elements.addAll(driver.findElements(By.tagName("img")));
					
					boolean click = false;
					int i = 0;
					while (!click){
						if (i == elements.size()){
							throw new ActionInstructionException("ActionClick - No image " + value + " in this page");
						} else {
							try {
								// Get attribute to test
								String src = elements.get(i).getAttribute("src").trim().toLowerCase();
								String id = elements.get(i).getAttribute("id").trim().toLowerCase();
								String alt = elements.get(i).getAttribute("alt").trim().toLowerCase();
								String str = elements.get(i).getText().trim().toLowerCase();								
								
								if (src.contains(value) || alt.contains(value) || str.contains(value) || id.contains(value)){	
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
				ExpressionValue val = interpreter.computeExpression(act.getUrl(), variables);
				driver.get(val.getValue().toString());

				System.out.println("J'ai fini l'action open");
			}

			/*
			 * Action CHECK
			 */
			else if (action.getAction() instanceof ActionCheck) {
				System.out.println("Check - ActionInstruction");
				
				ActionCheck act = (ActionCheck) action.getAction();
				
				boolean value = interpreter.getBooleanValue(act.getValue(), variables);
				
				ExpressionValue valExp = interpreter.computeExpression(act.getElement(), variables);
				String valueToTest = valExp.getValue().toString().replaceAll("'", "");
				valueToTest = valueToTest.replaceAll("\"", "");
				valueToTest = valueToTest.trim().toLowerCase();
				
				if (act.getElement() instanceof VariableReference || act.getElement() instanceof NumLiteralExpression 
						|| act.getElement() instanceof GetAction){					

					if (valExp.getType() == ExpressionValueType.list){

						List<ExpressionValue> list =  (List<ExpressionValue>) valExp.getValue();
						for (ExpressionValue obj : list) {
							doActionCheck(obj.getValue().toString(), value);
						}					
					} else {
						doActionCheck(valueToTest, value);						
					}
				}
					
				else {
					throw new ActionInstructionException("Impossible to check this object : " + act.getElement());
				}
				
			}

			/*
			 * Action TYPE
			 */
			else if (action.getAction() instanceof ActionType) {
				System.out.println("Type - ActionInstruction");
				ActionType act = (ActionType)action.getAction();
				
				ExpressionValue expElem = interpreter.computeExpression(act.getNameElement(), variables);				
				ExpressionValue expValue = interpreter.computeExpression(act.getValue(), variables);
				
				if (expElem.getType() != ExpressionValueType.list){
					doActionType(expElem.getValue().toString(), expValue);
				} else {
					List<ExpressionValue> list =  (List<ExpressionValue>) expElem.getValue();
					for (ExpressionValue obj : list) {
						doActionType(obj.getType().toString(), expValue);
					}	
				}
			}
			
			/*
			 * ACTION SELECT
			 */
			else if (action.getAction() instanceof SelectAction) {
				System.out.println("Select - ActionInstruction");
				
				SelectAction act = (SelectAction)action.getAction();
				
				ExpressionValue expElem = interpreter.computeExpression(act.getNameElement(), variables);				
				ExpressionValue expValue = interpreter.computeExpression(act.getValue(), variables);
				
				String elemToTest = expValue.getValue().toString().replaceAll("'", "");
				elemToTest = elemToTest.replaceAll("\"", "");
				elemToTest = elemToTest.trim().toLowerCase();
				
				String valueToTest = expValue.getValue().toString().replaceAll("'", "");
				valueToTest = valueToTest.replaceAll("\"", "");
				valueToTest = valueToTest.trim().toLowerCase();
				
				if (expElem.getType() == ExpressionValueType.list 
						|| expValue.getType() == ExpressionValueType.list){
					throw new ActionInstructionException("Impossible to have list Object in this function");
				} else {
					List<WebElement> elements = new ArrayList<WebElement>();
					elements.addAll(driver.findElements(By.tagName("select")));
					
					boolean click = false;
					int i = 0;
					while (!click){
						if (i == elements.size()){
							throw new ActionInstructionException("ActionnSelect - No dropdown list " + expValue.getValue().toString() + " in this page");
						} else {
							try {
								// Get attribute to test
								String alt = elements.get(i).getAttribute("name").trim().toLowerCase();
								String str = elements.get(i).getText().trim().toLowerCase();
								String id = elements.get(i).getAttribute("id").trim().toLowerCase();
								
								// find the dropdown
								if (alt.contains(elemToTest) || str.contains(elemToTest) || id.contains(elemToTest)){	
									Select dropList = new Select(elements.get(i));
									List<WebElement> options = dropList.getOptions();
									for (WebElement opt : options) {
										String strOpt = opt.getText().toLowerCase().trim();
										if (strOpt.contains(valueToTest)){
											dropList.selectByVisibleText(opt.getText());
										}
									}									
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
			}
			else {
				throw new ActionInstructionException("Undefined ActionInstruction");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void doActionCheck(String valueToTest, boolean value) throws SeleniumDriverException{
		
		WebDriver driver = SeleniumDriver.getInstance().getDriver();
		
		List<WebElement> elements = new ArrayList<WebElement>();
		elements.addAll(driver.findElements(By.cssSelector("input[type='checkbox']")));
		elements.addAll(driver.findElements(By.cssSelector("input[type='radio']")));
		
		boolean click = false;
		int i = 0;
		while (!click){
			if (i == elements.size()){
				throw new ActionInstructionException("ActionCheck - No checkbox " + valueToTest + " in this page");
			} else {
				try {
					// Get attribute to test
					String name = elements.get(i).getAttribute("name").trim().toLowerCase();
					String val = elements.get(i).getAttribute("value").trim().toLowerCase();
					String id = elements.get(i).getAttribute("id").trim().toLowerCase();
					String str = elements.get(i).getText().trim().toLowerCase();
					
					if (name.contains(valueToTest) || val.contains(valueToTest) 
							|| 	str.contains(valueToTest) || id.contains(valueToTest)){
						
						WebDriverWait wait = new WebDriverWait(driver, 5);
					    wait.until(ExpectedConditions.elementToBeClickable(elements.get(i)));
					    
					    // si selectionné et value false
					    // si deselectionne et value true
					    if ( (elements.get(i).isSelected() && !value) || !elements.get(i).isSelected() && value)
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
	
	public void doActionType(String valueToTest, ExpressionValue expValue) throws SeleniumDriverException{
		
		WebDriver driver = SeleniumDriver.getInstance().getDriver();
		
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
					
					
					if (name.contains(valueToTest) || id.contains(valueToTest) || place.contains(valueToTest)){	
						elem.clear();								
							
						if (expValue.getType() != ExpressionValueType.list){										
							elem.sendKeys(expValue.getValue().toString());	
						} else {
							throw new ActionInstructionException("Impossible to type a list inside a textbox");
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
}
