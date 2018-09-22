package com.eCommerce.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.eCommerce.base.TestBase;

public class LoginTest extends TestBase {
	@Test
	public void loginAsRegsiteredUser() {
		
		driver.findElement(By.xpath(OR.getProperty("storeLink"))).click();
		driver.findElement(By.xpath(OR.getProperty("loginLink"))).click();
		
		
	}

}
