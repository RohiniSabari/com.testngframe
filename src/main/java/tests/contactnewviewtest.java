package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.base.Contactnewviewpage;
import com.training.base.Homepage;
import com.training.base.Loginpage;

import listenersdemo1.ListenersSSF;
import pages.LoginPage;


@Listeners(ListenersSSF.class)
public class contactnewviewtest extends Basetest{
	
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
        Contactnewviewpage c =hp.clickcontact(driver);
		Assert.assertTrue(c.verifyuniquename(driver),"view name displayed");
		Thread.sleep(3000);
		
		
		
		
	}
		
}
