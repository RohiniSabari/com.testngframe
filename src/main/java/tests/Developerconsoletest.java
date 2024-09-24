package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Developerconsolepage;
import Pages.Homepage;
import Pages.Loginpage;
import listenersdemo1.ListenersSSF;

@Listeners(ListenersSSF.class)
public class Developerconsoletest extends Basetest {

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
		WebDriver driver=getBrowser();
			hp.clickUserMenu(driver);
			test.get().info("Usermenu clicked");
			Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
			Developerconsolepage console= hp.selectDeveloperconsole(driver);
			
			Assert.assertTrue(console.verifydeveloper(driver), "Developer Console window is displayed");
test.get().info("Deveoperpage verified");}
}