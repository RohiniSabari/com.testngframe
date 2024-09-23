package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.base.Homepage;
import com.training.base.Loginpage;
import com.training.base.Myprofilepage;

import listenersdemo1.ListenersSSF;
import pages.LoginPage;


@Listeners(ListenersSSF.class)

public class Hometest extends Basetest{
	
	
	Homepage hp;
	WebDriver driver;
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException {
		WebDriver driver = getBrowser();
		Loginpage lp = new Loginpage(driver);
		hp = lp.loginToApp(driver);
	}
	
	@Test
	public void verifyhomeprofile() throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver=getBrowser();
	
		hp.clickUserMenu(driver);
		Assert.assertTrue(hp.verifyusermenu(),"user menu option should be available");
		  Myprofilepage profilePage = hp.selectMyProfilePage(driver);
		    profilePage.clickEditProfile(driver);
		    Assert.assertTrue(profilePage.verifyContactIframeAvailability(driver), "frame is available");
		  Assert.assertTrue(profilePage.verifyAboutTab(driver), "about tab ");
		   Assert.assertTrue(profilePage.verifyLastNameChange(),"");
		   Thread.sleep(3000);
		   Assert.assertTrue(profilePage.verifypost(driver,"Hel"));
		   Assert.assertTrue(profilePage.verifyFileUpload(driver));
		    profilePage.clickOnAddPhoto(driver);
		    Assert.assertTrue(profilePage.verifyAddPhoto(driver));
		 
		    
		    
		  
	}
	

}
