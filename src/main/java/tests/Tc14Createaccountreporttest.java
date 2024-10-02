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
import Pages.Tc14Createaccountreportpage;
import listenersdemo1.ListenersSSF;
@Listeners(ListenersSSF.class)

public class Tc14Createaccountreporttest extends Basetest{





			Homepage hp;
				WebDriver driver;
				@BeforeMethod
				public void login() throws FileNotFoundException, IOException {
					WebDriver driver = getBrowser();
					Loginpage lp = new Loginpage(driver);
					hp = lp.loginToApp(driver);
				}

				@Test
				public void verifyaccountreport() throws FileNotFoundException, IOException, InterruptedException {
					WebDriver driver = getBrowser();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			      Tc14Createaccountreportpage c =hp.clickaccount5(driver);
			      test.get().info("accountreport clicked");
					Assert.assertTrue(c.verifyaccountreport(driver),"Report page with details and <report name>is displayed.");
					Thread.sleep(3000);

					 logger.info("Account report verified");


				}

			}



