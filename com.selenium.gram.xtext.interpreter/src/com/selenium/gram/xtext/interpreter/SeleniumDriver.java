package com.selenium.gram.xtext.interpreter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDriver {
	
	private WebDriver driver;
	
	/** Constructeur privé */
	private SeleniumDriver(){
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
 
	/** Instance unique pré-initialisée */
	private static SeleniumDriver INSTANCE;
 
	/** Point d'accès pour l'instance unique du singleton */
	public static SeleniumDriver getInstance(){	
		if (INSTANCE == null)
			INSTANCE = new SeleniumDriver();
		return INSTANCE;
	}

	public WebDriver getDriver(){
		return this.driver;
	}
}
