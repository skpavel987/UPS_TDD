package upsShippingPageActions;

import org.openqa.selenium.WebDriver;

import upsShippingPAgeElements.UpsPAgeElementsClass;

public class UpsPageAction {
	
	UpsPAgeElementsClass UpsPageActionElement;
	
	
	public UpsPageAction(WebDriver driver) {
		this.UpsPageActionElement = new UpsPAgeElementsClass(driver);
	
	}
    
	public void inputCountryorTerritory() {
		
		UpsPageActionElement.CountryOrTerritory().sendKeys("United States");
	}
	
	public void inputName() {
		
		UpsPageActionElement.Name().sendKeys("Expo");
	}
	 public void inputContactName() {
		 
		 UpsPageActionElement.ContactName().sendKeys("Ruhul");
	 }
	 
	 public void inputAddress() {

		 UpsPageActionElement.Address().sendKeys("101-12 Jamaica"); // if I want to  put int and char 
	 }
	 
	 public void inputAddress2() {

		 UpsPageActionElement.Address2().sendKeys("Queens");
	 }
	 
	 public void inputAddress3() {
		
		 UpsPageActionElement.Address3().sendKeys("County");
	 }
	  public void inputZipCode() {
		 
		 UpsPageActionElement.ZipCode().sendKeys("12345");
	 }
	  
	  public void inputCity() {

		 UpsPageActionElement.City().sendKeys("Jamaica");
		  
	  }
	  
	  public void inputState() {
		  
		  UpsPageActionElement.State().sendKeys("NY");
	  }
	  
	  public void inputEmail() {
		  
		  UpsPageActionElement.Email().sendKeys("abc@gmail.com");
		  
	  }
	  
	  public void inputPhone() {
		  
		  UpsPageActionElement.Phone().sendKeys("1234567890");
	  }
	  
	  public void inputPhoneExtension() {
		  
		  UpsPageActionElement.PhoneExtension().sendKeys("321");
	  }
	  
	  public void clickEmailCheckbox() {
		  
		  UpsPageActionElement.EmailCheckbox().click();
	  }
	 
	  public void clickDiffReturnAddLever() {

		  UpsPageActionElement.DiffReturnAddLever().click();		  
		  
	  }
	  
	 /* public void clickContinue() {
		   // i eliminate this section because You want us to click cancel button.
		  UpsPageActionElement.Continue().click();
		  
	  }*/
	  
	  public void clickCancelShipment() {
		  
		  UpsPageActionElement.CancelShipment().click();
	  }
	  
	  public void readConfirmCancelShipment() {
		  UpsPageActionElement.ConfirmCancelShipment().isDisplayed();
		  
		 
	  }
	  public void clickCancelYes() {
		  
		  UpsPageActionElement.CancelYes().click();
	  }
}


