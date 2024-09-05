package com.testngframe;



import java.io.FileNotFoundException;
import java.io.IOException;




import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utils.Fileutils;





public class Logintest extends BaseTest{
	@Test()

	public void LogintestTc01() throws InterruptedException, FileNotFoundException, IOException {
		
		driver.navigate().to( Fileutils.readLoginPropertiesFile("prod.url"));
		String expectedUsername = Fileutils.readLoginPropertiesFile("valid.username");
		lp.enterUsername(expectedUsername);
				String actualUsername = lp.getValueAttribute(lp.userName);
		Assert.assertEquals(expectedUsername, actualUsername, "The actual and expected usernames should be same");
		lp.password.clear();
		String actualPassword = lp.getValueAttribute(lp.password);
		Assert.assertEquals("", actualPassword, "The actual and expected passwords should be same");
		lp.clickLogin();
		Assert.assertEquals(lp.getErrorMessage(), Fileutils.readLoginPropertiesFile("error.text"), "Error message should be same");
	
	

Thread.sleep(3000);}
	@Test()
	public void loginToSalesforceTC02() throws InterruptedException, FileNotFoundException, IOException {
		SoftAssert sa = new SoftAssert();
		driver.navigate().to(Fileutils.readLoginPropertiesFile("prod.url"));
		String expectedUsername = Fileutils.readLoginPropertiesFile("valid.username");
		lp.enterUsername(expectedUsername);
		String actualUsername = lp.getValueAttribute(lp.userName);
		sa.assertEquals(expectedUsername, actualUsername, "The actual and expected usernames should be same");
		lp.enterPassword(Fileutils.readLoginPropertiesFile("valid.password"));
		lp.clickLogin();
		sa.assertEquals(driver.getTitle(), Fileutils.readLoginPropertiesFile("homepage.title"));
		System.out.println("Reached last line");
		sa.assertAll();
	}
}







