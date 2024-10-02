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
import Pages.Tc10CreateAccountpage;
import listenersdemo1.ListenersSSF;

@Listeners(ListenersSSF.class)
public class createaccounttest extends Basetest{
	Homepage hp;
	WebDriver driver;
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException {
		WebDriver driver = getBrowser();
		Loginpage lp = new Loginpage(driver);
		hp = lp.loginToApp(driver);
	}

	@Test
	public void verifyaccountname() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		logger.info("Browser instance launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Tc10CreateAccountpage tc=hp.clickaccount(driver);
        test.get().info("account clicked");
		Assert.assertTrue(tc.verifyaccountname(driver),"account name displayed and new account displayed and saved");
		logger.info("Account verified");
		Thread.sleep(3000);




	}

}


