package com.selenium.gram.xtext.interpreter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.selenium.gram.xtext.interpreter.exceptions.SeleniumDriverException;


public class SeleniumDriver {
	
	private WebDriver driver;
	
	/** Constructeur privé */
	private SeleniumDriver(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
 
	/** Instance unique pré-initialisée */
	private static SeleniumDriver INSTANCE;
 
	/** Point d'accès pour l'instance unique du singleton 
	 * @throws SeleniumDriverException */
	public static SeleniumDriver getInstance() throws SeleniumDriverException{	
		if (INSTANCE == null)
			throw new SeleniumDriverException("Driver non initialisé");
		return INSTANCE;
	}

	public WebDriver getDriver(){
		return this.driver;
	}
	
	public static void initializeDriver(String browser) throws SeleniumDriverException{
		WebDriver driver = null;
		switch(browser){
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			throw new SeleniumDriverException("Navigateur non supporté : "+browser);
		}
		INSTANCE = new SeleniumDriver(driver);
	}
	
	public static void closeDriver(){
		if(INSTANCE != null && INSTANCE.driver != null){
			INSTANCE.driver.close();
			INSTANCE.driver = null;
		}
		INSTANCE = null;
	}
}
