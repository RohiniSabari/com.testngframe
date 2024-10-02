package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utils.Waitutils;

public class Tc2021222324Leads extends Basepage{
	public Tc2021222324Leads(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Lead_Tab")
	public WebElement lead;



	public  Tc2021222324Leads clicklead(WebDriver driver) {
		this.lead.click();
		return new Tc2021222324Leads(driver);
	}



	public boolean verifylead(WebDriver driver) {
		boolean islead1 = true;
		if(this.lead.isDisplayed()) {
		this.lead.click();


}

return islead1;
}

	@FindBy(xpath="//select[@id='fcf']")
	public WebElement leadselect;
	public boolean verifyleaddropdown(WebDriver driver) {
		boolean isdropdown=true;
 leadselect.click();
	Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	List<WebElement>view1=view.getOptions();
	for (WebElement element : view1) {
		System.out.println(element.getText());
	}
return isdropdown;
}


	@FindBy(id="userNavLabel")
	public WebElement Usermenu;
	@FindBy(xpath="//a[@title='Logout']")
	public WebElement logout;

	@FindBy(xpath="//input[@id='username']")
	public WebElement username1;
	@FindBy(xpath="//input[@id='password']")
	public WebElement pwd1;
	@FindBy(xpath="//*[@id='Login']")
	public WebElement login1;
	@FindBy(id="Lead_Tab")
	public WebElement Leadslink1;



	public boolean verifydefaultview(WebDriver driver) throws InterruptedException {

	boolean defaultview=true;
	Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	view.selectByIndex(1);
	Thread.sleep(3000);
	if(this.Usermenu.isDisplayed()) {
	Usermenu.click();

	logout.click();
	Thread.sleep(2000);

	username1.sendKeys("rohini@tekarch.com");

	pwd1.clear();
	pwd1.sendKeys("Chennai12p1");
	login1.click();
	Thread.sleep(3000);

	Leadslink1.click();
	}
	return defaultview;
	}
	public boolean verifytodayleads(WebDriver driver) {
		boolean isdeal=true;
	if(this.lead.isDisplayed()) {

	this.lead.click();

	this.leadselect.click();
	Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	view.selectByIndex(3);


	WebElement gobutton=driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
			gobutton.click();




}return isdeal;
	}

public boolean verifynewbutton(WebDriver driver) {
	boolean isverifynew=true;
if(this.lead.isDisplayed()) {

	lead.click();

	leadselect.click();
	if(Waitutils.explicitlyWaitForClickableElement(driver, this.leadselect)) {

	WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
	New.click();
	WebElement LeadStatus = driver.findElement(By.xpath("//select[@id='lea13']"));
	LeadStatus.click();
	WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
	LastName.sendKeys("Ra");
	WebElement Company = driver.findElement(By.xpath("//input[@id='lea3']"));
	Company.sendKeys("Ban");

	WebElement SaveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
	SaveButton.click();










}}
return isverifynew;}}





















