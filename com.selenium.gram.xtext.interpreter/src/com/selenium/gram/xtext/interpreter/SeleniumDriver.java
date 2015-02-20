package com.selenium.gram.xtext.interpreter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDriver {
	
	private WebDriver driver;
	
	/** Constructeur priv� */
	private SeleniumDriver(){
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
 
	/** Instance unique pr�-initialis�e */
	private static SeleniumDriver INSTANCE;
 
	/** Point d'acc�s pour l'instance unique du singleton */
	public static SeleniumDriver getInstance(){	
		if (INSTANCE == null)
			INSTANCE = new SeleniumDriver();
		return INSTANCE;
	}

	public WebDriver getDriver(){
		return this.driver;
	}
}
