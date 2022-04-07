package kitePOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPOM {

	//1 Global Variable Declaration, using Private for working 3 webElement
	
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
		
		//2 initialization webelements by initeElements
		
		public KitePinPOM(WebDriver driver) {                                       // Constructor created with className
			PageFactory.initElements(driver, this);                                          // this = call GV from same class                    
		}
		
		//3 Utilization
		
		public void enterpin(String piN) {
			pin.sendKeys(piN);
		}
		public void clickOnContinueButton() {
			continueButton.click();
		}
}
