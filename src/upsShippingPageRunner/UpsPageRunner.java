package upsShippingPageRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import upsShippingBaseDrive.UpsBaseDriverClass;
import upsShippingPageActions.UpsPageAction;




public class UpsPageRunner extends UpsBaseDriverClass {
	WebDriver driver = getChromeDriver(); // cant be able to fetch the driver from base class
	UpsPageAction PageAction = new UpsPageAction(driver);

@BeforeTest
	
	public void beforeMethod() {
		
		driver.get("https://www.ups.com/ship/guided/origin?tx=5614715613706317&loc=en_US");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
	

@Test

public void ShippingTest () {
	
	PageAction.inputCountryorTerritory();
	PageAction.inputName();
	PageAction.inputContactName();
	PageAction.inputAddress();
	PageAction.inputAddress2();
	PageAction.inputAddress3();
	PageAction.inputZipCode();
	PageAction.inputCity();
	PageAction.inputState();
	PageAction.inputEmail();
	PageAction.inputPhone();
	PageAction.inputPhoneExtension();
	PageAction.clickEmailCheckbox();
	PageAction.clickDiffReturnAddLever();
	PageAction.clickCancelShipment();
	PageAction.readConfirmCancelShipment();
	PageAction.clickCancelYes();
	
	String msg = PageAction.toString(); // got stuck here. dont understand what to do next. 
	
}
	
	
	
	
	
	
	
	
	
	
	
}
