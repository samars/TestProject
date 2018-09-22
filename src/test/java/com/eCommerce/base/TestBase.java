package com.eCommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	/*Initialise
	 * WebDriver
	 * Properties
	 * Log
	 * Extent report`
	 * DB
	 * Mail
	 */
	
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	
	
	@BeforeSuite
	public void setUp() {
		
		if(driver==null) {
			try {
				fis = new FileInputStream("E:\\eclipse-photon\\TestProject\\src\\test\\resources\\properties\\OR.properties");
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				config.load(fis);
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				fis = new FileInputStream("E:\\eclipse-photon\\TestProject\\src\\test\\resources\\properties\\Config.properties");
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			if(config.getProperty("browser").equals("firefox")) {
				driver = new FirefoxDriver();
				
				
			} else if(config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse-photon\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if(config.getProperty("browser").equals("IE")) {
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse-photon\\TestProject\\src\\test\\resources\\executables\\MicrosoftWebDriver.exe");
				driver = new InternetExplorerDriver();
				
				}
			
			driver.get(config.getProperty("testSuiteUrl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.Wait")), TimeUnit.SECONDS);
			}
		
	}
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		}
	}

}
