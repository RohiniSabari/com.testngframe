package Pages;

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
		@FindBy(id="Account_Tab")
		public WebElement Account;
		public Tc10CreateAccountpage clickaccount(WebDriver driver) {
			this.Account.click();
			return new Tc10CreateAccountpage(driver);
		}
		@FindBy(id="Account_Tab")
		public WebElement Account1;
		public Tc11createnewview clickaccount1(WebDriver driver) {
			this.Account1.click();
			return new Tc11createnewview(driver);
		}
		@FindBy(id="Account_Tab")
		public WebElement Account2;
		public Tc12Editviewpage  clickaccount3(WebDriver driver) {
			this.Account2.click();
			return new Tc12Editviewpage (driver);
		}
		@FindBy(id="Account_Tab")
		public WebElement account4;
		
		public  Tc13Mergeaccountpage clickaccount4(WebDriver driver) {
			this.account4.click();
			return new Tc13Mergeaccountpage(driver);
		}
		
		@FindBy(id="Lead_Tab")
		public WebElement lead;
		
		
		
		public  Tc2021222324Leads clicklead(WebDriver driver) {
			this.lead.click();
			return new Tc2021222324Leads(driver);
		}
		@FindBy(xpath="//a[@title='Home Tab']")
		public WebElement home;

		public  Tc3334353637RandomScenariospage clickhome(WebDriver driver) {
			this.home.click();
			return new Tc3334353637RandomScenariospage(driver);
		}
		
		
		public Tc2526272829303132Contactnewviewpage clickcontact(WebDriver driver) {
			this.Contact.click();
			return new Tc2526272829303132Contactnewviewpage(driver);
		}
		public Myprofilepage selectMyProfilePage(WebDriver driver) {
			this.myprofile.click();
			return new Myprofilepage(driver);
		}
		@FindBy(id="Opportunity_Tab")
		public WebElement opport;
		public  Tc15and16171819Createopportnew clickcreate(WebDriver driver) {
			this.opport.click();
			return new Tc15and16171819Createopportnew(driver);
		}
		
		@FindBy(id="Account_Tab")
		public WebElement accounttab;
		public  Tc14Createaccountreportpage clickaccount5(WebDriver driver) {
			this.accounttab.click();
			return new Tc14Createaccountreportpage(driver);
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
	


