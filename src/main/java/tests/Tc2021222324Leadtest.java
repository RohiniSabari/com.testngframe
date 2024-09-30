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

import Pages.Tc2021222324Leads;
import listenersdemo1.ListenersSSF;
@Listeners(ListenersSSF.class)

public class Tc2021222324Leadtest extends Basetest{
	
	
		

		
			
			
				Homepage hp;
					WebDriver driver;
					@BeforeMethod
					public void login() throws FileNotFoundException, IOException {
						WebDriver driver = getBrowser();
						Loginpage lp = new Loginpage(driver);
						hp = lp.loginToApp(driver);
					}

				@Test
					public void verifyLead() throws FileNotFoundException, IOException, InterruptedException {
						WebDriver driver = getBrowser();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				      Tc2021222324Leads c =hp.clicklead(driver);
				      test.get().info("Lead clicked");
						Assert.assertTrue(c.verifylead(driver),"Link should navigate to Leads Home page");
						 logger.info("Lead verified");
						
						
						
					}
					
					@Test
					public void verifyLeadselectview() throws FileNotFoundException, IOException, InterruptedException {
						WebDriver driver = getBrowser();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				      Tc2021222324Leads c =hp.clicklead(driver);
				      test.get().info("Lead clicked");
						Assert.assertTrue(c.verifyleaddropdown(driver),"List should drop down and should show the following contents: All Open Leads / My Unread Leads / Recently Viewed Leads / Today's Leads."); 
						Thread.sleep(3000);
						 logger.info("Leadselectview verified");
						
				}
				@Test
					public void verifydefaultview() throws FileNotFoundException, IOException, InterruptedException {
						WebDriver driver = getBrowser();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				      Tc2021222324Leads c =hp.clicklead(driver);
				      test.get().info("Lead clicked");
						Assert.assertTrue(c.verifydefaultview(driver),"'Todays leads' view should have been the default view and that view's page should be displayed once the go button is clicked");
						Thread.sleep(3000);
						 logger.info("Default view verified");
						
				}
					@Test
					public void verifytodaydeal() throws FileNotFoundException, IOException, InterruptedException {
						WebDriver driver = getBrowser();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				      Tc2021222324Leads c =hp.clicklead(driver);
				      test.get().info("Lead clicked");
						Assert.assertTrue(c.verifytodayleads(driver),"Todays's Lead page should be displayed.");
						 logger.info("todaydeal verified");
						
				}	
					
					@Test
					public void verifynewbuttonlead() throws FileNotFoundException, IOException, InterruptedException {
						WebDriver driver = getBrowser();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				      Tc2021222324Leads c =hp.clicklead(driver);
				      test.get().info("Lead clicked");
						Assert.assertTrue(c.verifynewbutton(driver),"new lead should be saved and the newly created lead view page should be opened");
						 logger.info("New button lead verified");
						
				}			
					
					
					
					
					
}

