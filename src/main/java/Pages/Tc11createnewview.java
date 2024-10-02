package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tc11createnewview extends Basepage{



		public Tc11createnewview (WebDriver driver) {
			super(driver);

		}
		@FindBy(id="Account_Tab")
		public WebElement Account1;

		@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")
		public WebElement CreateNewview;

		@FindBy(xpath="//input[@id=\"fname\"]")
		public WebElement  ViewName;

		@FindBy(xpath="//*[@id=\"devname\"]")
		public WebElement ViewUniqueName;
		@FindBy(xpath="//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
		public WebElement Save;

		public Tc11createnewview clickaccount(WebDriver driver) {
			this.Account1.click();
			return new Tc11createnewview(driver);
		}
		public boolean verifyaccountname1(WebDriver driver) {
			boolean isaccount = true;
			this.Account1.click();
			if(this.CreateNewview.isDisplayed()) {
			this.CreateNewview.click();
			this.ViewName.clear();
			this.ViewName.sendKeys("ohrowehgf1");

				this.Save.click();

			}

		 else {
				isaccount = false;
			}


			return isaccount;
		}

	}

