package upsShippingBaseDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsBaseDriverClass {
	
	WebDriver getChromeDriver(){
	
	System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
	
	}
}
