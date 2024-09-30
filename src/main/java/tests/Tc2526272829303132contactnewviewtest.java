package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Tc2526272829303132Contactnewviewpage;
import Pages.Homepage;
import Pages.Loginpage;
import listenersdemo1.ListenersSSF;



@Listeners(ListenersSSF.class)
public class Tc2526272829303132contactnewviewtest extends Basetest{
	
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
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
        test.get().info("Contact clicked");
		Assert.assertTrue(c.verifyuniquename(driver),"view name displayed");
		Thread.sleep(3000);
		
		 logger.info("unique name verified");
		
		
	}
	
@Test
	public void verifycreatenewcontact() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
        test.get().info("Contact clicked");
		Assert.assertTrue(c.verifycreatenewcontact(driver),"New contact should be created");
		Thread.sleep(3000);
		
		 logger.info("createnewcontact verified");
		
		
	}	
	@Test
	public void verifycreatecontact() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
		Assert.assertTrue(c.verifyrecentcreatecontact(driver),"Recently created contacts should be displayed");
		Thread.sleep(3000);
		 logger.info("createcontact  verified");
		
		
		
	}	
	
@Test
		public void verifycheckmycontact() throws FileNotFoundException, IOException, InterruptedException {
			WebDriver driver = getBrowser();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
	        test.get().info("Contact clicked");
			Assert.assertTrue(c.verifymycontact(driver),"My contacts View should be displayed");
			
			 logger.info("checkmycontact verified");
			
			
			
		}	
	@Test
	public void verifyviewcontact() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
        test.get().info("Contact clicked");
		Assert.assertTrue(c.verifyContactname(driver),"Contact Page related to <contact name>, which contains entire information about that <contact name> should be displayed");
		Thread.sleep(3000);
		
		 logger.info("veiw contact verified");
		
		
	}	
	@Test
	public void verifyerror() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
		Assert.assertTrue(c.verifyerrormsg(driver),"Error message is appeared under the View Name field. The Error message appears as \"Error: You must enter a value\".");
		Thread.sleep(3000);
		 logger.info("Error verified");
		
		
		
	}	
@Test
	public void verifycancel() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
        test.get().info("Contact clicked");
		Assert.assertTrue(c.verifycancel(driver),"Contacts Home page is displayed and the View ABCD should not be created.");
		Thread.sleep(3000);
		
		 logger.info("Cancel verified");
		
		
	}	
	
@Test
	public void verifysaveandnew() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc2526272829303132Contactnewviewpage c =hp.clickcontact(driver);
        test.get().info("Contact clicked");
		Assert.assertTrue(c.verifysaveandnew(driver),"New contact is created. Contact Edit: New Contact Page is dispalyed");
		 logger.info("save and new verified");
		
		
		
		
	}	
	
	
	
	
	
}
