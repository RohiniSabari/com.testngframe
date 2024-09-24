package Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utils.Actionutils;
import Utils.Waitutils;

public class Tc15and16171819Createopportnew extends Basepage{
	public  Tc15and16171819Createopportnew(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="Opportunity_Tab")
	public WebElement opport;
	public  Tc15and16171819Createopportnew clickcreate(WebDriver driver) {
		this.opport.click();
		return new Tc15and16171819Createopportnew(driver);
	}
	public boolean verifycreateoppotmenu(WebDriver driver) {
		boolean isaccount = true;
		this.opport.click();
	
	 Select view=new Select(driver.findElement(By.id("fcf")));
	 List<WebElement> dd = view.getOptions();
	//System.out.println(dd.size());
	 for (int i= 0; i< dd.size(); i++) {
	     System.out.println(dd.get(i).getText());

	 }
	 return isaccount;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//input[contains(@title,'New')]")
	public WebElement new1;
	
	@FindBy(id="opp3")
	public WebElement Oppname;
	
	@FindBy(xpath="//img[@title='Account Name Lookup (New Window)']")
	public WebElement Lookupwindow;
	@FindBy(xpath="//a[@class='calToday']")
	public WebElement Today;
	
	
	public boolean verifynewopportunity(WebDriver driver) throws InterruptedException {
		boolean isaccount = true;
		this.new1.click();
	
	
	
	
	
	Oppname.clear();
	Oppname.sendKeys("riyaa1");
	
	if(this.Lookupwindow.isDisplayed()) {
	this.Lookupwindow.click();
	String oldWindow = driver.getWindowHandle();
	Set<String> getAllWindows = driver.getWindowHandles();
	String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	driver.switchTo().window(getWindow[1]);
	
	driver.switchTo().frame("searchFrame");
	driver.findElement(By.id("lksrch")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name='go']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("resultsFrame");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//tr[@class='dataRow even last first']/th/a")).click();
	driver.switchTo().window(getWindow[0]);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='opp9']")).click();
    WebElement today=driver.findElement(By.xpath("//a[@class='calToday']"));
	today.click();
	Thread.sleep(4000);
	
	
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ESCAPE).build().perform();
	WebElement Stage = driver.findElement(By.xpath("//select[@id='opp11']"));
	Stage.click();
	Select dropdown = new Select(Stage);
	dropdown.selectByValue("Qualification");
	driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("80");
	WebElement Save = driver.findElement(By.xpath("//td[@id='bottomButtonRow']"));
	Save.click();
}
	return isaccount;}
	
	
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")
	public WebElement pipeline;
	 
public boolean verifypipeline(WebDriver driver) throws InterruptedException {
	boolean ispipeline = true;
	if(this.pipeline.isDisplayed()) {
	this.pipeline.click();
	}
	
return ispipeline;
}
@FindBy(xpath="//a[contains(text(),'Stuck Opportunities')]")
public WebElement stuck;

public boolean verifystuckopport(WebDriver driver) throws InterruptedException {
	boolean isstuck = true;
	if(this.stuck.isDisplayed()) {
	this.stuck.click();
	}
	
return isstuck;
}


@FindBy(xpath="//select[@id='quarter_q']")
public WebElement Interval;
@FindBy(xpath="//input[@title='Run Report']")
public WebElement RunReport;
public boolean verifyquarterlyt(WebDriver driver) throws InterruptedException {
	boolean isstuck = true;
	if(this.Interval.isDisplayed()) {
	this.Interval.click();
	
	



Select s=new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
s.selectByVisibleText("Next FQ");
Select s1=new Select(driver.findElement(By.xpath("//select[@id='open']")));
s1.selectByVisibleText("Open Opportunities");
Thread.sleep(3000);
if(this.RunReport.isDisplayed())
{
RunReport.click();
	}}
return isstuck;
}
	}








