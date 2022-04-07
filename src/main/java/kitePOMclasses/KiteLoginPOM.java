package kitePOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPOM {

	// 1 Global Variable Declaration, using Private for working 3 webElement
	
		@FindBy(id ="userid") private WebElement loginId;
		@FindBy(id ="password") private WebElement password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
		
	// 2 initialization webelements by initeElements
		
		public KiteLoginPOM(WebDriver driver)                      // Constructor created with className
		{
			PageFactory.initElements(driver, this);                     // this = call GV from same class 
		}

	// 3 Utilization
		
		public void enterlogin(String uid) {
			loginId.sendKeys(uid);
		}
		public void enterpassword(String pwd) {
			password.sendKeys(pwd);
		}
		public void clickLoginButton() {
			loginButton.click();
		}
}
