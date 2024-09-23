package com.training.base;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Constants.FileConstants;
import Utils.Actionutils;
import Utils.Waitutils;

public class Mysettingspage extends Basepage{
	public  Mysettingspage(WebDriver driver) {
		super(driver);
	}
	// My Settings
			// personallink
	@FindBy(id="userNav-menuItems")
	public WebElement mySettings;
			@FindBy(xpath = "//*[@id=\'PersonalInfo_font\']")
			public WebElement personallink;

			@FindBy(xpath = "//*[@id=\"LoginHistory_font\"]")
			public WebElement loginHistorylink;

			@FindBy(xpath = "//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")
			public WebElement logindisplay;

			@FindBy(id = "contactInfoContentId")
			public WebElement iframeAboutTab;
			// Display&layoutlink

			@FindBy(xpath = "//*[@id=\"DisplayAndLayout_font\"]")
			public WebElement DisplayLayoutlink;

			@FindBy(id = "CustomizeTabs_font")
			public WebElement CustomizedTab;

			@FindBy(xpath = "//*[@id=\"p4\"]/option[9]")
			public WebElement customApp;

			@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[73]")
			public WebElement Availabletab;

			@FindBy(xpath = "//*[@id=\"duel_select_0_right\"]/img")
			public WebElement Add;

			@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
			public WebElement save;

			@FindBy(id = "tabBar")
			public WebElement tabList;

			// Emaillink

			@FindBy(xpath = "//*[@id=\"EmailSetup_font\"]")
			public WebElement Emaillink;

			@FindBy(id = "EmailSettings_font")
			public WebElement MyEmailSettings;

			@FindBy(id = "sender_name")
			public WebElement Emailname;

			@FindBy(xpath = "//*[@id=\"sender_email\"]")
			public WebElement Emailaddress;

			@FindBy(xpath = "//*[@id=\"useremailSection\"]/table/tbody/tr[7]/td[2]/div")
			public WebElement BCCradiobutton;

			@FindBy(name="save")
			public WebElement Savebutton;
			
			
			@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
			public WebElement Saveonemail;

			// Calendar and Remainders
			@FindBy(id = "CalendarAndReminders_font")
			public WebElement CalendarAndReminders;

			@FindBy(xpath = "//*[@id=\"Reminders_font\"]")
			public WebElement ActivityRemainder;

			@FindBy(id = "testbtn")
			public WebElement OpenaTestRemainder;

			@FindBy(xpath = "//*[@id=\"summary\"]")
			public WebElement SampleEventPopup;

			@FindBy(css = "#displayBadge")
			public WebElement moderatorButton;

			@FindBy(id = "profileTab_sfdc.ProfilePlatformFeed")
			public WebElement profilePage;

			@FindBy(id = "contactTab")
			public WebElement contactTab;

			@FindBy(xpath = "//div[@class='cxfeeditem feeditem'][1]//p")
			public WebElement firstPostText;

			@FindBy(xpath = "(//*[@class='contentFileTitle'])[1]")
			public WebElement verifyFilePostElement;

			@FindBy(name = "j_id0:waitingForm")
			public WebElement spinnerIcon;

			@FindBy(id = "cropWaitingPage:croppingForm")
			public WebElement spinnerWhileCropping;

			@FindBy(id = "progressIcon")
			public WebElement fileUploadSpinner;
			
			public boolean verifysettings(WebDriver driver) {
				boolean issettingsVerified = true;
			//	this.mySettings.click();
				if(this.personallink.isDisplayed()) {
					this.personallink.click();
				
				
				if (this.loginHistorylink.isDisplayed()) {
					this.loginHistorylink.click();
					this.logindisplay.click();
					
					
						
					
							this.logindisplay.sendKeys(FileConstants.TEST_FILEDOWNLOAD_PATH );
							
						
				
				}
				else 
				{
					issettingsVerified = false;
				}
				}
				
				return issettingsVerified;
			}
			
			public boolean verifyDisplayandLayout(WebDriver driver) {
				boolean isdisplayandlayout =true;
			//	this.mySettings.click();
				if(this.DisplayLayoutlink.isDisplayed()) {
					this.DisplayLayoutlink.click();
				
				}
				
					this.CustomizedTab.click();
					if(this.customApp.isDisplayed()) {
					this.customApp.click();
					
					
					Select s=new Select(driver.findElement(By.id("p4")));
					s.selectByVisibleText("Salesforce Chatter");
					Select s1=new Select(driver.findElement(By.id("duel_select_0")));
					s1.selectByVisibleText("Reports");
					
					
					Waitutils.explicitlyWaitForClickableElement(driver, this.Add);
					this.Add.click();
					this.save.click();
					}
					
				
				
				return isdisplayandlayout;
			}
			
			//email
			
			
			public boolean verifyemailsettings(WebDriver driver) {
				boolean issettingsVerified1 = true;
			
				if(this.Emaillink.isDisplayed()) {
					this.Emaillink.click();
					this.MyEmailSettings.click();
				if (this.Emailname.isDisplayed()) {
					this.Emailname.clear();
					this.Emailname.sendKeys("rohini");
					if(this.Emailaddress.isDisplayed())
					this.Emailaddress.clear();
					this.Emailaddress.sendKeys("rohinirajandran@gmail.com");
				this.BCCradiobutton.click();
			
				this.Savebutton.click();
					
				}
				else
				{
				boolean issettingsVerified11=false;
				}
				}
				return issettingsVerified1;	
							}	
			
			
			public boolean verifycalendarandreminder(WebDriver driver) throws InterruptedException {
				boolean iscalendar = true;
			
				if(this.CalendarAndReminders.isDisplayed()) {
					this.CalendarAndReminders.click();
					this.ActivityRemainder.click();
					this.OpenaTestRemainder.click();
					}
				
				if(this.OpenaTestRemainder.isDisplayed()) {
					
					String parentWindow = driver.getWindowHandle();
					for(String handle : driver.getWindowHandles()) { 
						if(handle != parentWindow) {
							driver.switchTo().window(handle);
							
							Thread.sleep(3000);
							
							
							
				}
						else
						{
							iscalendar=false;
						}
				}}
				return iscalendar;
						
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				}	
			
			
			
			

