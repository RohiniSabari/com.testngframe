package com.testngframe;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.training.base.Loginpage;





public class BaseTest {
	
 Loginpage lp;
 WebDriver driver;
	 

	@BeforeMethod(alwaysRun = true)
	public void setup() {

		driver = new ChromeDriver();
		lp = new Loginpage(driver);
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
		driver.close();
	}

}
