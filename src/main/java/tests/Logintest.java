package tests;

import java.io.FileNotFoundException;
		import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.training.base.Homepage;
import com.training.base.Loginpage;

import Utils.Commonutils;
import Utils.Fileutils;
import listenersdemo1.ListenersSSF;

@Listeners(ListenersSSF.class)



public class Logintest extends Basetest{
			@Test()
				public void loginErrorMessageTC01() throws InterruptedException, FileNotFoundException, IOException {
					WebDriver driver = getBrowser();
					
					logger.info("Browser instance launched");
					Loginpage lp = new Loginpage(driver);
					driver.navigate().to(Fileutils.readLoginPropertiesFile("prod.url"));
					test.get().info("App launched");
					String expectedUsername = Fileutils.readLoginPropertiesFile("valid.username");
					lp.enterUsername(expectedUsername);
					test.get().info("username entered");
					String actualUsername = lp.getValueAttribute(lp.username);
					Assert.assertEquals(expectedUsername, actualUsername, "The actual and expected usernames should be same");
					lp.password.clear();
					String actualPassword = lp.getValueAttribute(lp.password);
					Assert.assertEquals("", actualPassword, "The actual and expected passwords should be same");
					lp.clickLogin();
					test.get().info("Login button clicked");
					//Commonutils.captureScreenshot(driver);
					Assert.assertEquals(lp.getErrorMessage(), Fileutils.readLoginPropertiesFile("error.text"), "Error message should be same");
				logger.info("loginErrorMessageTc01:Finished");
}
				@Test()
				public void loginToSalesforceTC02() throws InterruptedException, FileNotFoundException, IOException {
					WebDriver driver = getBrowser();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//					lp = new LoginPage(driver);
					Loginpage lp = new Loginpage(driver);
					SoftAssert sa = new SoftAssert();
					driver.navigate().to(Fileutils.readLoginPropertiesFile("prod.url"));
					String expectedUsername = Fileutils.readLoginPropertiesFile("valid.username");
					lp.enterUsername(expectedUsername);
					String actualUsername = lp.getValueAttribute(lp.username);
					sa.assertEquals(expectedUsername, actualUsername, "The actual and expected usernames should be same");
					lp.enterPassword(Fileutils.readLoginPropertiesFile("valid.password"));
					lp.clickLogin();
					Commonutils.captureScreenshot(driver);
					sa.assertEquals(driver.getTitle(), Fileutils.readLoginPropertiesFile("homepage.title"));
					System.out.println("Reached last line");
					sa.assertAll();
					
				}
				
				@Test()
				public void loginToSalesforceTC03() throws InterruptedException, FileNotFoundException, IOException {
					WebDriver driver = getBrowser();
					Loginpage lp = new Loginpage(driver);
					driver.navigate().to(Fileutils.readLoginPropertiesFile("prod.url"));
					String expectedUsername = Fileutils.readLoginPropertiesFile("valid.username");
					
					
					Homepage hPage = lp.loginToApp(driver, expectedUsername, Fileutils.readLoginPropertiesFile("valid.password"));
					Assert.assertEquals(driver.getTitle(), Fileutils.readLoginPropertiesFile("homepage.title"));
					Assert.assertTrue(hPage.isHomePage(), "User should be in home page");
					driver.close();
				}
				
			//	@Test(dataProvider = "ValidAccounts", dataProviderClass = CommonUtils.class)
				public void loginToSalesforceAccountsTc04(String username, String pass)
						throws InterruptedException, FileNotFoundException, IOException {
					WebDriver driver = getBrowser();
					Loginpage lp = new Loginpage(driver);
					driver.navigate().to(Fileutils.readLoginPropertiesFile("prod.url"));
					Homepage hPage = lp.loginToApp(driver, username, pass);
//					Assert.assertEquals(driver.getTitle(), FileUtils.readLoginPropertiesFile("homepage.title"));
//					Assert.assertTrue(hPage.isHomePage(), "User should be in home page");
				}
				
			//	@DataProvider(name = "InvalidAccounts")
				public Object loginTestDataInValid() {
//					To read those user accounts logic
					return new Object[][] { {"mithun@tek.com", "12345" }, { "deek@tek.com", "12345" },
							{ "dean@tek.com", "12345" } };
				}
				
				
				
				
				
				
			}





	
