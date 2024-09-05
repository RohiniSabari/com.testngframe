package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




	public class Homepage extends BasePage {
		
		public Homepage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath = "//h2[text()='Community']")
		public WebElement communityPanel;
		
		public boolean isHomePage() {
			return this.communityPanel.isDisplayed();
		}

	}


