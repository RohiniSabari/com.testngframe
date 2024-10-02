package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tc13Mergeaccountpage extends Basepage{
	public  Tc13Mergeaccountpage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="Account_Tab")
	public WebElement account4;

	@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
	public WebElement Mergeaccount;
	@FindBy(id="srch")
	public WebElement fb1;

	@FindBy(name="srchbutton")
	public WebElement FindAcc1;
	@FindBy(xpath="//input[@id='cid0']")
	public WebElement Button122;
	@FindBy(xpath="//input[@id='cid1']")
	public WebElement Button123;
	@FindBy(xpath="//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]")
	public WebElement Next;
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Merge']")
	public WebElement Merge;
	public  Tc13Mergeaccountpage clickaccount4(WebDriver driver) {
		this.account4.click();
		return new Tc13Mergeaccountpage(driver);
	}
	public boolean verifymerge(WebDriver driver) {
		boolean isaccount = true;
		this.account4.click();
		if(this.Mergeaccount.isDisplayed())
			this.Mergeaccount.click();
			if(this.fb1.isDisplayed()) {
			this.fb1.clear();
		fb1.sendKeys("abc1");

			this.FindAcc1.click();


		  this.Button122.click();
		  this.Button123.click();

		    if(this.Next.isDisplayed()) {

		  this.Next.click();
		   if(this.Merge.isDisplayed()) {
		    this.Merge.click();


			Alert ac1=driver.switchTo().alert();
			System.out.println(ac1.getText());
			ac1.accept();


}}}
			return isaccount;
	}}
