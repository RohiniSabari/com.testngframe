package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utils.Waitutils;

public class Tc12Editviewpage extends Basepage{
	

		
		
		public  Tc12Editviewpage(WebDriver driver) {
			super(driver);
			
		}
		@FindBy(id="Account_Tab")
		public WebElement Account2;

		@FindBy(xpath="//select[@id='fcf']")
		public WebElement View;
		@FindBy(linkText="Edit")
		public WebElement  Editlink;

		@FindBy(id="fname")
		public WebElement ViewName;
		public Tc12Editviewpage  clickaccount3(WebDriver driver) {
			this.Account2.click();
			return new Tc12Editviewpage (driver);
		}
		
		public boolean verifyaccountname3(WebDriver driver) {
			boolean isaccount = true;
			this.Account2.click();
			if(this.View.isDisplayed()) {
			this.View.click();
		
		
		
				  Select dropdown = new Select(driver.findElement(By.id("fcf")));
				    dropdown.selectByIndex(2);
				    Waitutils.explicitlyWaitForClickableElement(driver, this.Editlink);
			this.Editlink.click();
			WebElement viewname=driver.findElement(By.id("fname"));
			viewname.clear();
			viewname.sendKeys("shalini");
		WebElement fields = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select accfield = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
		accfield.selectByIndex(1);
		WebElement Operator = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
		operator.selectByIndex(3);
			
		WebElement value = driver.findElement(By.id("fval1"));
		value.clear();
		value.sendKeys("<a>");
		WebElement dropdown1= driver.findElement(By.xpath("//*[@id='colselector_select_0']"));
			Select Availablelist = new Select(dropdown1);
			List<WebElement> options = Availablelist.getOptions();

			boolean Element_available = false; 
			
			for(int i=0; i<options.size(); i++) {
				if(options.get(i).getText().equals("Last Activity")) {
					Element_available = true;
					WebElement Add= driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
					Add.click();
					break;
				}
			}
	
			if(Element_available = false) {
				WebElement dropdown11 = driver.findElement(By.xpath("//select[@id='colselector_select_1']"));
				Select Selectedlist = new Select(dropdown11);
				List<WebElement> Selectedoptions = Selectedlist.getOptions();

				for(int i=0; i<options.size(); i++) {
					if(Selectedoptions.get(i).getText().equals("Last Activity")) {
						break;
					}
				}	
			}

	driver.findElement(By.name("save")).click();
}
			return isaccount;
}}