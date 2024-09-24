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

import Pages.Tc15and16171819Createopportnew;
import listenersdemo1.ListenersSSF;
@Listeners(ListenersSSF.class)

public class Tc15and16171819createopportnewtest extends Basetest{
	Homepage hp;
	WebDriver driver;
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException {
		WebDriver driver = getBrowser();
		Loginpage lp = new Loginpage(driver);
		hp = lp.loginToApp(driver);
	}

	@Test
	public void verifycreateopport() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      Tc15and16171819Createopportnew c =hp.clickcreate(driver);
		Assert.assertTrue(c.verifycreateoppotmenu(driver),"Drop down with \"All Oppotunities\", \"Closing Next Month\", \"Closing This Month\", \"My Opportunities\", \"New This Week\", \"Recently Viewed Opportunities\",\"Won\"  should be available");
		Thread.sleep(3000);
	}
	@Test
	
	public void verifyopportunity() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      Tc15and16171819Createopportnew c =hp.clickcreate(driver);
		    Assert.assertTrue(c.verifynewopportunity(driver),"New Opportunity page is displayed with Opportunity details.");
		    
		driver.quit();
		
		
	}
@Test
	
	public void verifypipeline() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = getBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      Tc15and16171819Createopportnew c =hp.clickcreate(driver);	
      Assert.assertTrue(c.verifypipeline(driver),"Report Page with the Opportunities that are pipelined will be displayed.");
}
@Test

public void verifystuck() throws FileNotFoundException, IOException, InterruptedException {
	WebDriver driver = getBrowser();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  Tc15and16171819Createopportnew c =hp.clickcreate(driver);	
  Assert.assertTrue(c.verifystuckopport(driver),"Report Page with the Opportunities that are Stuck will be displayed.");
}

@Test

public void verifyquarterly() throws FileNotFoundException, IOException, InterruptedException {
	WebDriver driver = getBrowser();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  Tc15and16171819Createopportnew c =hp.clickcreate(driver);	
  Assert.assertTrue(c.verifyquarterlyt(driver),"Report Page with the Opportunities that satisfies the search criteria will be displayed.");
}


}


