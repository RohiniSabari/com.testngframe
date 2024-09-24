package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	public static Logger logger = (Logger) LogManager.getLogger("Basetest");
	
public Basepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
}
