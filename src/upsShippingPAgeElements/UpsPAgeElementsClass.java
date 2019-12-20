package upsShippingPAgeElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsPAgeElementsClass {
	
	WebDriver driver;
	
	public UpsPAgeElementsClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement CountryOrTerritory() {
		WebElement CountryOrTerritory = driver.findElement(By.name("countryDropdown"));
		return CountryOrTerritory;
	}

	public WebElement Name() {
		WebElement Name = driver.findElement (By.name("organization"));
		return Name;
	}
	
	public WebElement ContactName() {
		WebElement ContactName = driver.findElement (By.className("origincontactName"));
		return ContactName;
	}
	public WebElement Address() {
		WebElement Address = driver.findElement(By.name("address1"));
		return Address;
	}
	public WebElement Address2() {
		WebElement Address = driver.findElement(By.id("originaddress2"));
		return Address;
		}
	public WebElement Address3() {
		WebElement Address = driver.findElement(By.id("originaddress3"));
		return Address;
		}
	
	public WebElement ZipCode() {
		WebElement ZipCode = driver.findElement(By.id("originpostal"));
		return ZipCode;
		}
	public WebElement City() {
		WebElement City = driver.findElement(By.name("city"));
		return City;
		}
	
	public WebElement State() {
		WebElement State = driver.findElement(By.name("stateDropdown"));
		return State;
		}
	
	public WebElement Email() {
		WebElement Email = driver.findElement(By.id("originemail"));
		return Email;
		}
	
	public WebElement Phone() {
		WebElement Phone = driver.findElement(By.id("originphone"));
		return Phone;
		}
	public WebElement PhoneExtension() {
		WebElement PhoneExtension = driver.findElement(By.id("originextension"));
		return PhoneExtension;
		}
	
	public WebElement EmailCheckbox() {
		WebElement EmailCheckbox = driver.findElement(By.className("ups-checkbox-custom-label"));
		return EmailCheckbox;
		}
	
	public WebElement DiffReturnAddLever() {
		WebElement DiffReturnAddLever = driver.findElement(By.className("ups-lever_switch_no"));
		return DiffReturnAddLever;
		}
	
	/*public WebElement Continue() {
		WebElement Continue = driver.findElement(By.className("ups-cta ups-cta_primary ng-star-inserted"));
		return Continue;
		}*/
	
	public WebElement CancelShipment() {
		WebElement CancelShipment = driver.findElement(By.className("ups-cta ups-cta_secondary ng-star-inserted"));
		return CancelShipment;
		}
	
	public WebElement ConfirmCancelShipment() {
		WebElement ConfirmCancelShipment = driver.findElement(By.className("modal-title"));
		return ConfirmCancelShipment;
	}
	
	public WebElement CancelYes() {
		WebElement CancelYes = driver.findElement(By.id("nbsCancelShipmentWarningYes"));
		return CancelYes;
	}
}
