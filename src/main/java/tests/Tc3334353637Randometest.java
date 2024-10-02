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
import Pages.Tc3334353637RandomScenariospage;
import listenersdemo1.ListenersSSF;

@Listeners(ListenersSSF.class)
public class Tc3334353637Randometest extends Basetest{
	Homepage hp;
	WebDriver driver;
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException {
		WebDriver driver = getBrowser();
		Loginpage lp = new Loginpage(driver);
		hp = lp.loginToApp(driver);
	}
	@Test
	public void verifyfirstandlast() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       Tc3334353637RandomScenariospage c =hp.clickhome(driver);
       test.get().info("Home clicked");
		Assert.assertTrue(c.verifyfirstandlastname(driver),"1. 'User:FirstName LastName' page should be displayed2. This page should be same as the 'My Profile' page.");
		Thread.sleep(3000);
		 logger.info("first and last name verified");

}
	@Test
	public void verifyeditlast() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       Tc3334353637RandomScenariospage c =hp.clickhome(driver);
       test.get().info("Home clicked");
		Assert.assertTrue(c.verifyeditlastname(driver),"1. The 'Edit Profile' popup should be closed.2. Verify that the updated LastName of the account holder is displayed at the top left hand side of the page3. Verify that the 'User menu for FirstName LastName' menu button shows the updated Last Name, at the top right hand side of the page.          4. Verify that the 'User:FirstName LastName' page has the updated LastName.");
		Thread.sleep(3000);
		 logger.info("edit last name verified");

}
@Test
public void verifycustomtab() throws FileNotFoundException, IOException, InterruptedException {
	WebDriver driver = getBrowser();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   Tc3334353637RandomScenariospage c =hp.clickhome(driver);
   test.get().info("Home clicked");
	Assert.assertTrue(c.verifytab(driver),"1. SalesForce application should be Launced.2. The tab removed at step 3 should not be displayed in the tab bar.");
	Thread.sleep(3000);
	 logger.info("Custom tab verified");

}
@Test
public void verifycalendartime() throws FileNotFoundException, IOException, InterruptedException {
	WebDriver driver = getBrowser();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   Tc3334353637RandomScenariospage c =hp.clickhome(driver);
   test.get().info("Home clicked");
	Assert.assertTrue(c.verifycalendarweeklyoccurance(driver),"The 'Calendar for FirstName LastName' page should be displayed with 'Other' event in the time slot 8:00PM to 9:00PM, as a link.");
	Thread.sleep(3000);
	 logger.info("calendartime verified");

}


}
