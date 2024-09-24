package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tc33343536RandomScenariospage extends Basepage{

	public Tc33343536RandomScenariospage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@title='Home Tab']")
	public WebElement home;
	@FindBy(className="currentStatusUserName")
	public WebElement namelink;
	
	public  Tc33343536RandomScenariospage clickhome(WebDriver driver) {
		this.home.click();
		return new Tc33343536RandomScenariospage(driver);
	}
	public boolean verifyfirstandlastname(WebDriver driver) {
		boolean isverifyfirstandlast = true;
		
	if(this.namelink.isDisplayed()) {
	this.namelink.click();
	
	
	
}else {
	isverifyfirstandlast = false;
}
	return isverifyfirstandlast ;}
	
	public boolean verifyeditlastname(WebDriver driver) throws InterruptedException {
		boolean isverifyeditlast= true;
		
	if(this.namelink.isDisplayed()) {
	this.namelink.click();
	
	 String homepage = driver.getWindowHandle();
	 System.out.println("homepage is displayed");
	 WebElement Edit = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
	 Edit.click();
	 //driver.findElement(By.id("contactTab")).click();
	 driver.switchTo().frame("contactInfoContentId");

	WebElement about=driver.findElement(By.xpath("//li[@id='aboutTab']"));
	about.click();

	Thread.sleep(3000);
	WebElement lastname = driver.findElement(By.id("lastName"));
	lastname.clear();
	lastname.sendKeys("Raj");
	WebElement saveall=driver.findElement(By.xpath("//input[@value=\"Save All\"]"));
	saveall.click();
	driver.switchTo().defaultContent();
	driver.close();

	}return isverifyeditlast;
	}
	
	
	@FindBy(name="customize")
	public WebElement customize;
	public boolean verifytab(WebDriver driver) throws InterruptedException {
		boolean isverifytab=true;
		WebElement home=driver.findElement(By.className("allTabsArrow"));
		 home.click();
	if(this.customize.isDisplayed()) {
	
	 this.customize.click();
	 WebElement Chatter = driver.findElement(By.xpath("//option[@value='Chatter']"));
	Chatter.click();
	  WebElement leftarrow = driver.findElement(By.className("leftArrowIcon"));
	 leftarrow.click();
	  WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
	 save.click();
	 WebElement user=driver.findElement(By.id("userNavLabel"));
		JavascriptExecutor excute=(JavascriptExecutor)driver;
		excute.executeScript("arguments[0].click();", user);
	 WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
	 Thread.sleep(3000);
	 WebElement Uname1=driver.findElement(By.xpath("//input[@id='username']"));
		Uname1.sendKeys("rohini@tekarch.com");
		WebElement pwd1=driver.findElement(By.xpath("//input[@id='password']"));
		pwd1.clear();
		pwd1.sendKeys("Chennai12p1");
	  WebElement login1 = driver.findElement(By.xpath("//*[@id='Login']"));
	login1.click();
	}
return isverifytab;}}











