package Pages;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.Fileutils;






public class Loginpage extends Basepage{
public Loginpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "Login")
	public WebElement loginButton;

	@FindBy(xpath = "//input[@id='username']")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "forgot_password_link")
	public WebElement forgotPassowrd;

	@FindBy(name = "rememberUn")
	public WebElement rememberMe;

	@FindBy(id = "hint_back_chooser")
	public WebElement savedUserName;

	@FindBy(how = How.ID, using = "error")
	public WebElement errorMessage;






	public void enterUsername(String username) {
		this.username.sendKeys(username);
		logger.debug("Username is entered");
	}

	public void enterPassword(String passWord) {
		this.password.sendKeys(passWord);
		logger.debug("Password is entered");
	}

	public String getErrorMessage() {
		logger.debug("error message is fetched");
		return this.errorMessage.getText();

	}

	public void clickLogin() {
		logger.debug("Logging button clicked");
		this.loginButton.click();
	}

	public String getValueAttribute(WebElement element) {
		return element.getAttribute("value");
	}
	public Homepage loginToApp(WebDriver driver,String username,String password){

		this.enterUsername(username);
		this.enterPassword(password);
		this.clickLogin();
		return new Homepage(driver);
	}

	public Homepage loginToApp(WebDriver driver) throws FileNotFoundException, IOException {
		driver.navigate().to(Fileutils.readLoginPropertiesFile("prod.url"));
		logger.debug("Navigated to the login page");
		this.enterUsername(Fileutils.readLoginPropertiesFile("valid.username"));
		this.enterPassword(Fileutils.readLoginPropertiesFile("valid.password"));
		this.clickLogin();
		return new Homepage(driver);
	}




}

