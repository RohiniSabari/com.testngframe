package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.base.Developerconsolepage;
import com.training.base.Homepage;
import com.training.base.Loginpage;
import com.training.base.Logoutpage;

import Utils.Commonutils;
import listenersdemo1.ListenersSSF;
import pages.LoginPage;
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
		public void verifydeveloper() throws FileNotFoundException, IOException, InterruptedException {
			WebDriver driver = getBrowser();
			hp.clickUserMenu(driver);
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Logoutpage lo=hp.selectLogout(driver);
			lo.selectLogout();
	        Assert.assertTrue(lo.verifylogout(driver),"logout");
			test.get().info("Logout button clicked");
			Commonutils.captureScreenshot(driver);
			
		}
			
}
