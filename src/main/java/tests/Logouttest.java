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
import Pages.Logoutpage;
import Utils.Commonutils;
import listenersdemo1.ListenersSSF;

@Listeners(ListenersSSF.class)
public class Logouttest extends Basetest{

	Homepage hp;
	WebDriver driver;
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException {
		WebDriver driver = getBrowser();
		Loginpage lp = new Loginpage(driver);
		hp = lp.loginToApp(driver);
	}


		@Test
		public void verifyLogout() throws FileNotFoundException, IOException, InterruptedException {
			WebDriver driver = getBrowser();
			logger.info("Browser instance launched");
			hp.clickUserMenu(driver);
			test.get().info("usermenu clicked");
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Logoutpage lo=hp.selectLogout(driver);
			lo.selectLogout(driver);
			test.get().info("logout selected");
	        Assert.assertTrue(lo.verifylogout(driver),"logout");


			//test.get().info("Logout button clicked");
			Commonutils.captureScreenshot(driver);
			logger.info("Logout verified");


		}

}
