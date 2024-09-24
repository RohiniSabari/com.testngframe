package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Tc11createnewview;

import listenersdemo1.ListenersSSF;
@Listeners(ListenersSSF.class)
public class Tc11CreateAccounttest extends Basetest{
	Homepage hp;
		WebDriver driver;
		@BeforeMethod
		public void login() throws FileNotFoundException, IOException {
			WebDriver driver = getBrowser();
			Loginpage lp = new Loginpage(driver);
			hp = lp.loginToApp(driver);
		}

		@Test
		public void verifyuniquename() throws FileNotFoundException, IOException, InterruptedException {
			WebDriver driver = getBrowser();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       Tc11createnewview c =hp.clickaccount1(driver);
			Assert.assertTrue(c.verifyaccountname1(driver),"view name displayed");
			Thread.sleep(3000);
			
			
			
			
		}
			
	}


