package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class TooltipSteps {
	WebDriver driver=new EdgeDriver();
	
	
	@Given("I clicked on homepage selenium website")
	public void i_clicked_on_homepage_selenium_website() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//WebDriver driver=new EdgeDriver();
		driver.get("http://selenium-prd.firebaseapp.com/home.html");
		
	}

	@Given("I selected a Intractions")
	public void i_selected_a_intractions() {
		WebElement username=driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement button=driver.findElement(By.tagName("button"));
		button.click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	//	WebElement intra=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
	//	Actions a=new Actions(driver);	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement intra = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Intractions')]")));

		// Scroll into view if necessary
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
		
		Actions a=new Actions(driver);
		a.moveToElement(intra).build().perform();
	}

	@When("I selected Tooltip action")
	public void i_selected_tooltip_action() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebElement tool=driver.findElement(By.linkText("Tool Tip"));
		tool.click();
	}

	@When("I clicked top")
	public void i_clicked_top() {
		Actions a=new Actions(driver);	
		
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	    a.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div[1]"))).build().perform();
	    
	}

	@When("I clicked bottom")
	public void i_clicked_bottom() {
		Actions a=new Actions(driver);	
		
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div[2]"))).build().perform();
		
	}

	@When("I clicked right")
	public void i_clicked_right() {
		Actions a=new Actions(driver);	
		
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div[3]"))).build().perform();
		
	}

	@When("I clicked left")
	public void i_clicked_left() {
		Actions a=new Actions(driver);	
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div[4]"))).build().perform();
		
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		driver.quit();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

}
