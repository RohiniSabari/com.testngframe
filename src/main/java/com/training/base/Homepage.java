package com.training.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import Utils.Fileutils;
import Utils.Waitutils;






	public class Homepage extends Basepage{
	
	




		public Homepage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath = "//h2[text()='Community']")
		public WebElement communityPanel;
		
	
		@FindBy(xpath="//div[@id='userNavButton']")
		public WebElement userMenu;
		
		@FindBy(xpath="//*[@id='userNav-menuItems']/a")
		public List<WebElement>userMenuOptions;

		@FindBy(xpath = "//*[@id='userNav-menuItems']/a[1]")
		public WebElement myprofile;
		
		@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[2]")
		public WebElement mySettings;
		
		
		@FindBy(xpath="//a[@title='Contacts Tab']")
		public WebElement Contact;
		public boolean isHomePage() {
		return this.communityPanel.isDisplayed();
		}
		public void clickUserMenu(WebDriver driver) {
			Waitutils.explicitlyWaitForClickableElement(driver, this.userMenu);
		
			this.userMenu.click();
			
		}
		
		
		public Contactnewviewpage clickcontact(WebDriver driver) {
			this.Contact.click();
			return new Contactnewviewpage(driver);
		}
		public Myprofilepage selectMyProfilePage(WebDriver driver) {
			this.myprofile.click();
			return new Myprofilepage(driver);
		}
		
		public Mysettingspage selectMysettings(WebDriver driver) {
			this.mySettings.click();
			return new Mysettingspage(driver);
		}
		@FindBy(linkText="Developer Console")
		public WebElement developer;
		public Developerconsolepage selectDeveloperconsole(WebDriver driver) {
			this.developer.click();
			return new Developerconsolepage(driver);
		}
		@FindBy(xpath="//a[contains(text(),'Logout')]")
		
		public WebElement logout1;
		public Logoutpage selectLogout(WebDriver driver) {
			//Waitutils.explicitlyWaitForClickableElement(driver, this.logout);
			this.logout1.click();
			return new Logoutpage(driver);
		}
		
		
	
		public void selectdropdown(WebDriver driver,String option) {
			String cssselector="[title='"+option+"']";
			driver.findElement(By.cssSelector(cssselector)).click();
		}
		
	
		public boolean verifyusermenu() throws FileNotFoundException, IOException {
			boolean isverifiedmenuoptions=true;
		
			String[] expectedusermenu=Fileutils.readHomePropertiesFile("usermenu.options").split(",");
			for (int i=0;i<expectedusermenu.length;i++) {
				if(expectedusermenu[i].equals(userMenuOptions.get(i).getText())){
					
					System.out.println("Expected"+expectedusermenu[i]+"Actual"+userMenuOptions.get(i).getText());
				}
				else {
				 isverifiedmenuoptions=false;
				}
				
			}
			return isverifiedmenuoptions;
		}
	}
	


