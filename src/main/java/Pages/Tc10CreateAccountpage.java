package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tc10CreateAccountpage extends Basepage {
	public Tc10CreateAccountpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="Account_Tab")
	public WebElement Account;

	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	public WebElement New;

	@FindBy(id="acc2")
	public WebElement  AccountName;

	@FindBy(name="save")
	public WebElement Save;


	
	public Tc10CreateAccountpage clickaccount(WebDriver driver) {
		this.Account.click();
		return new Tc10CreateAccountpage(driver);
	}
	public boolean verifyaccountname(WebDriver driver) {
		boolean isaccount = true;
		this.Account.click();
		this.New.click();
		if(this.AccountName.isDisplayed()) {
			this.AccountName.clear();
			this.AccountName.sendKeys("abc1");
			this.Save.click();
		
		}
		
	 else {
			isaccount = false;
		}
		
		
		return isaccount;
	}
	
}
