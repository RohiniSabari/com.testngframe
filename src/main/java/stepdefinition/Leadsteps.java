package stepdefinition;


import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Tc2021222324Leads;

import io.cucumber.java.en.*;
import tests.Basetest;

public class Leadsteps extends Basetest{
	
Loginpage lp;
	Homepage hp;
		
	
		
	 WebDriver driver;

		@Given("I clicked on Login")
		public void i_clicked_on_login() {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new io.cucumber.java.PendingException();
		
			WebDriver driver = getDriver("chrome", false);
			lp = new Loginpage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://login.salesforce.com");
	lp.enterUsername("rohini@tekarch.com");
	lp.enterPassword("Chennai12p1");
	lp.clickLogin();
		 hp=new Homepage(driver);
		
    
		
	}

		@When("I Clicked  Leads tab")
		public void i_clicked_leads_tab() {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new io.cucumber.java.PendingException();
		
		 
			Tc2021222324Leads c =hp.clicklead(driver);
		
		
		}

		@Then("I validate the Leads Tab")
		public void i_validate_the_leads_tab() throws InterruptedException {
		
		 Tc2021222324Leads c =hp.clicklead(driver);
		 String actualTitle = "https://tekarch-a9-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";

			String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
			if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("User is on home page");
			}
			else {
				System.out.println("home page is not Launched");
			} 
		 
		 
	   // throw new io.cucumber.java.PendingException();
		
	
		}}
