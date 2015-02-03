package com.selenium.compiler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 WebDriver driver = new FirefoxDriver();

    	 String baseUrl = "https://nte.gemtech.fr/campus/";
    	 
    	 Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
    	 selenium.open(baseUrl);
    	 selenium.wait(5000);
    	 selenium.click("id=first");
    }
}
