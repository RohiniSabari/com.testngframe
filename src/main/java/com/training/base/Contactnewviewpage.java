package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactnewviewpage extends Basepage{

	public Contactnewviewpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@title='Contacts Tab']")
	public WebElement Contact;

	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	public WebElement Createnewview;

	@FindBy(xpath="//input[@id='fname']")
	public WebElement  ViewNames;

	@FindBy(xpath="//input[@id='devname']")
	public WebElement ViewUniqueName;

	@FindBy(name = "save")
	public WebElement save;
	
	public Contactnewviewpage clickcontact(WebDriver driver) {
		this.Contact.click();
		return new Contactnewviewpage(driver);
	}
	public boolean verifyuniquename(WebDriver driver) {
		boolean isAboutTabVerified = true;
		this.Createnewview.click();
		if(this.ViewNames.isDisplayed()) {
			this.ViewNames.sendKeys("Rohini1");
		
		}
		if (this.ViewUniqueName.isDisplayed()) {
			this.ViewUniqueName.clear();
			this.ViewUniqueName.sendKeys("Rohinir");
		} else {
			isAboutTabVerified = false;
		}
		this.save.click();
		
		return isAboutTabVerified;
	}
	
	
	
	
	
	
}
