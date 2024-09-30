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

import Pages.Tc12Editviewpage;
import listenersdemo1.ListenersSSF;
@Listeners(ListenersSSF.class)

public class Tc12Editviewtest extends Basetest{
	
	
		Homepage hp;
			WebDriver driver;
			@BeforeMethod
			public void login() throws FileNotFoundException, IOException {
				WebDriver driver = getBrowser();
				Loginpage lp = new Loginpage(driver);
				hp = lp.loginToApp(driver);
			}

			@Test
			public void verifyeditview() throws FileNotFoundException, IOException, InterruptedException {
				WebDriver driver = getBrowser();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		       Tc12Editviewpage c =hp.clickaccount3(driver);
		       test.get().info("account clicked");
				Assert.assertTrue(c.verifyaccountname3(driver),"Accounts page is displayed with correct <username>and <View name> edit page Is displayed");
				Thread.sleep(3000);
				
				 logger.info("Account name verified");
				
				
			}
				
		}


