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
import Pages.Tc13Mergeaccountpage;
import listenersdemo1.ListenersSSF;


	@Listeners(ListenersSSF.class)

	public class Tc13verifymergetest  extends Basetest{
		
		
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
			      Tc13Mergeaccountpage c =hp.clickaccount4(driver);
					Assert.assertTrue(c.verifymerge(driver),"Merge by Accounts step 2 page is displayed with the selected accounts details to merge");
					Thread.sleep(3000);
					
					
					
					
				}
					
			}




