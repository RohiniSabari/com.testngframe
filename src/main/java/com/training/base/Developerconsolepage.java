package com.training.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Developerconsolepage extends Basepage {
	public  Developerconsolepage(WebDriver driver) {
		super(driver);
		// System.out.println("WebDriver initialized: " + (driver != null));
	      //  PageFactory.initElements(driver, this);
	}
	
	 

	  
	
	@FindBy(xpath="//a[@title='Developer Console (New Window)']")
	public WebElement developer;
	
	public boolean verifydeveloper(WebDriver driver) {
	boolean isdeveloper = true;
	
	if(developer.isDisplayed()) {
		developer.click();
		logger.debug("Developer consoler clicked");
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
	driver.switchTo().defaultContent();
		driver.quit();
	}
	
	return isdeveloper;
	}
}
