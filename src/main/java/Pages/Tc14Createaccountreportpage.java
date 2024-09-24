package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tc14Createaccountreportpage extends Basepage {

	public  Tc14Createaccountreportpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="Account_Tab")
	public WebElement accounttab;
	@FindBy(xpath="//a[contains(text(),'Accounts with last activity > 30 days')]")
	public WebElement last;
	@FindBy(xpath="//img[@id='ext-gen148']")
	public WebElement dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Created Date')]")
	public WebElement createdate;
	
	@FindBy(name="startDate")
	public WebElement startdate;
	
	@FindBy(name="endDate")
	public WebElement enddate;
	
	
	
	
	@FindBy(xpath="//button[@id='ext-gen49']")
	public WebElement save;
	
	
	@FindBy(name="reportName")
	public WebElement Reportname;
	
	@FindBy(id="saveReportDlg_DeveloperName")
	public WebElement Reportuniquename;
	
	
	@FindBy(xpath="//table[@id='dlgSaveAndRun']")
	public WebElement Saveandrun;
	public  Tc14Createaccountreportpage clickaccount5(WebDriver driver) {
		this.accounttab.click();
		return new Tc14Createaccountreportpage(driver);
	}
	public boolean verifyaccountreport(WebDriver driver) {
		boolean isaccount = true;
		this.accounttab.click();

	
	this.last.click();
	
	this.dropdown.click();

	this.createdate.click();

	startdate.clear();
	startdate.sendKeys("09/01/2024");
	
	enddate.clear();
	enddate.sendKeys("12/01/2024");
	
	save.click();
	
	Reportname.clear();
	Reportname.sendKeys("Accountreports");
	
	Reportuniquename.clear();
	
	Reportuniquename.sendKeys("ChangeReportUniqueName");
	
	Saveandrun.click();

return isaccount;
}}
