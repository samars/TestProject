package com.eCommerce.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	/*Initialise
	 * Webdriver
	 * Properties
	 * Log
	 * Extent report
	 * DB
	 * Mail
	 */
	
	public static WebDriver driver;
	
	
	
	@BeforeSuite
	public void setUp() {
		
	}
	
	@AfterSuite
	public void tearDown() {
		
	}

}
