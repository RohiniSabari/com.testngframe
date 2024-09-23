package com.training.base;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.Waitutils;

public class Logoutpage extends Basepage{

	public Logoutpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[contains(text(),'Logout')]")
    public WebElement logout1;
	
	public void selectLogout() {
		//Waitutils.explicitlyWaitForClickableElement(driver, this.logout);
	logout1.click();
		
	}
	
	public boolean verifylogout(WebDriver driver) {
		boolean isLogoutverify = true;
		
		if(this.logout1.isDisplayed()) {
			
			Waitutils.explicitlyWaitForClickableElement(driver, this.logout1);
			this.logout1.click();
			/*String	expectedUrl1 = driver.getCurrentUrl();
			String	actualUrl1 = "https://login.salesforce.com/";
				
			if(actualUrl1.equalsIgnoreCase(expectedUrl1)) {
					System.out.println("User is not in login page");
			}
				else {
					System.out.println("User is on login page");
				}*/
			
			
			
			
		}
		return isLogoutverify;
		}
}
	
	


