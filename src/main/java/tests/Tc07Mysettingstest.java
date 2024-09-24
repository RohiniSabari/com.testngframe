package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Mysettingspage;
import Utils.Commonutils;
import listenersdemo1.ListenersSSF;


@Listeners(ListenersSSF.class)
public class Tc07Mysettingstest extends Basetest{

	Homepage hp;
	WebDriver driver;
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException {
		WebDriver driver = getBrowser();
		Loginpage lp = new Loginpage(driver);
		hp = lp.loginToApp(driver);
	}
	
		@Test
		public void verifymysettings() throws FileNotFoundException, IOException, InterruptedException {
			WebDriver driver = getBrowser();
			hp.clickUserMenu(driver);
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Mysettingspage setting= hp.selectMysettings(driver);
			Assert.assertTrue(setting.verifysettings(driver),"My Settings verified and Login history is displayed and the data is downloaded in .csv format.");
		}
		
		
		
		@Test
		public void verifyDisplayandlayout() throws FileNotFoundException, IOException
		{
			WebDriver driver = getBrowser();
			hp.clickUserMenu(driver);
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Mysettingspage setting= hp.selectMysettings(driver);
			test.get().info("displayandlayout");
			Commonutils.captureScreenshot(driver);
		Assert.assertTrue(setting.verifyDisplayandLayout(driver),"Reports field is added to Selected Tabs list and also added in the links available in top of salesforce page and sales force chatter page and sales and marketing pages.");
		}
		
		
	@Test
		public void verifyemaillink() throws FileNotFoundException, IOException {
			WebDriver driver = getBrowser();
		    hp.clickUserMenu(driver);
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Mysettingspage setting= hp.selectMysettings(driver);
			Assert.assertTrue(setting.verifyemailsettings(driver),"Given details are saved as default mail options and My settings page is displayed");
			
			
			
		}
		
		
		@Test
		public void verifycalendark() throws FileNotFoundException, IOException, InterruptedException {
			WebDriver driver = getBrowser();
			hp.clickUserMenu(driver);
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Mysettingspage setting= hp.selectMysettings(driver);
			
			Assert.assertTrue(setting.verifycalendarandreminder(driver), "popup window displayed");
		
		}		
		
		
		
		
		
			
}
