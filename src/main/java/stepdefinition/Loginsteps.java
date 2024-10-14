package stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tests.Basetest;

public class Loginsteps extends Basetest{
	WebDriver driver=null;
	Loginpage lp;

	@Before()
	public void setup() {
		//driver = new ChromeDriver();
		lp = new Loginpage(driver);
	}
	
@After()
	public void tearDown() {
		driver.close();
	}

		
	
	
	
	


	@Given("I landed on login page")
	public void i_landed_on_login_page() {
	 driver = getDriver("chrome", false);
		lp = new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com");
	}

	@When("I entered valid username")
	public void i_entered_valid_username() {
		lp.enterUsername("rohini@tekarch.com");
	}

	@When("I entered valid password")
	public void i_entered_valid_password() {
		lp.enterPassword("Chennai12p1");
	}

	@When("I clicked login button")
	public void i_clicked_login_button() {
		lp.clickLogin();
	}

	@Then("I should be on homepage")
	public void i_should_be_on_homepage() throws FileNotFoundException, IOException {
		Homepage hp = new Homepage(driver);
		
		Assert.assertTrue(hp.isHomePage());
	
		
		
	}

	@When("I enter invalid username")
	public void i_enter_invalid_username() {
		lp.enterUsername("rohini@xyz.com");
	}

	@When("enter invalid password")
	public void enter_invalid_password() {
		lp.enterPassword("2344xyx");
	}

	@Then("I should be seeing error message")
	public void i_should_be_seeing_error_message() {
		String actualError = lp.getErrorMessage();
		String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertTrue(actualError.equals(expectedError));
		
	}

	@Given("I want go to {string}")
	public void i_want_go_to_https_login_salesforce_com(String url) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(url);
	}

	@When("I enter {string} and {string}")
	public void i_enter_rohini_and_deekshith(String username, String pass) {
		System.out.println(username+" password is: "+pass);
	}

	@Then("I click on the login button")
	public void i_click_on_the_login_button() {
	}



}
