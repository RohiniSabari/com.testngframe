package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Tc2526272829303132Contactnewviewpage extends Basepage{

	public Tc2526272829303132Contactnewviewpage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath="//a[@title='Contacts Tab']")
	public WebElement Contact;

	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	public WebElement Createnewview;

	@FindBy(xpath="//input[@id='fname']")
	public WebElement  ViewNames;

	@FindBy(xpath="//input[@id='devname']")
	public WebElement ViewUniqueName;

	@FindBy(name = "save")
	public WebElement save;

	public Tc2526272829303132Contactnewviewpage clickcontact(WebDriver driver) {
		this.Contact.click();
		return new Tc2526272829303132Contactnewviewpage(driver);
	}
	public boolean verifyuniquename(WebDriver driver) {
		boolean isAboutTabVerified = true;
		this.Createnewview.click();
		if(this.ViewNames.isDisplayed()) {
			this.ViewNames.sendKeys("Rohini1");

		}
		if (this.ViewUniqueName.isDisplayed()) {
			this.ViewUniqueName.clear();
			this.ViewUniqueName.sendKeys("Rohinir");
		} else {
			isAboutTabVerified = false;
		}
		this.save.click();

		return isAboutTabVerified;
	}


	@FindBy(xpath="//input[contains(@title,'New')]")
	public WebElement newbutton;
	@FindBy(xpath="//input[@id='name_firstcon2']")
	public WebElement firstname;
	@FindBy(xpath="//input[@id='name_lastcon2']")
	public WebElement lastname;
	@FindBy(xpath="//input[@id='con4']")
	public WebElement accountname;
	public boolean verifycreatenewcontact(WebDriver driver) throws InterruptedException {
		boolean isverify=true;
	if(this.newbutton.isDisplayed()) {



	newbutton.click();

	firstname.sendKeys("Rohini");

	lastname.sendKeys("R");

	accountname.sendKeys("Ramya");
	Thread.sleep(3000);
	WebElement save = driver.findElement(By.name("save"));
	save.click();




}
	return isverify;}


public boolean verifyrecentcreatecontact(WebDriver driver) throws InterruptedException {
	boolean isverify1=true;



	 Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
	 dropdown.selectByVisibleText("Recently Created");

return isverify1;
}



@FindBy(xpath="//input[@title='Go!']")
public WebElement Gobutton;
public boolean verifymycontact(WebDriver driver) {

boolean isverify2=true;

//Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
//dropdown.selectByVisibleText("My Contacts");
if(this.Gobutton.isDisplayed()) {
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	dropdown.selectByVisibleText("My Contacts");
this.Gobutton.click();}
return isverify2; }

@FindBy(xpath="//option[contains(text(),'Rohini')]")
		public WebElement Contactname;
public boolean verifyContactname(WebDriver driver) {
	boolean isverifycontact=true;

if(this.Contactname.isDisplayed()) {
this.Contactname.click();}
return isverifycontact;
}


public boolean verifyerrormsg(WebDriver driver) {
	boolean iserror=true;


WebElement createnew= driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
createnew.click();
WebElement Uniquename = driver.findElement(By.xpath("//input[@id='devname']"));
Uniquename.sendKeys("EFGH");
WebElement Save = driver.findElement(By.name("save"));
Save.click();
String actualmsg = driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]")).getText();
String errormsg = "Error: You must enter a value";
if(actualmsg.equals(errormsg))
{
	System.out.println("TestCase is passed");

}else
{
System.out.println("TestCase is failed");
}


return iserror;


}

@FindBy(name="cancel")
public WebElement cancel;
public boolean verifycancel(WebDriver driver) {
	boolean iscancel=true;

WebElement createnew= driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
createnew.click();
WebElement name = driver.findElement(By.name("fname"));
name.sendKeys("ABCD");
WebElement Uniquename = driver.findElement(By.xpath("//input[@id='devname']"));
Uniquename.sendKeys("EFGH");
if(this.cancel.isDisplayed()) {

cancel.click();
}
return iscancel;
}

@FindBy(name="save_new")
public WebElement saveandnew;
public boolean verifysaveandnew(WebDriver driver) {
	boolean issaveandnew=true;

WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
New.click();
WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
LastName.sendKeys("Ram1");
WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
AccountName.sendKeys("Global1");


if(this.saveandnew.isDisplayed()) {

this.saveandnew.click();






}return issaveandnew;}}











