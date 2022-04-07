package kitePOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePOM {

	//1 Declaration using Private for working  webElement
	
		@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
		@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
		
		//2 initialization webelements by initeElements
		
		public KiteHomePOM(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//3 Utilization
		public  String getActualuserId( ) {                           // Validation for USERID
			
//			String expecteduserId = uSeriD;                                         // from excel sheet string type
			String actualuserId = userId.getText();
			return actualuserId;
//			if (actualuserId.equals(expecteduserId)) {
//				System.out.println("UserId Matched, TC Pass");
//			}
//			else {
//				System.out.println("UserId Not Matched, TC Failed");
//			}
			}
			
			public void logOut() throws InterruptedException {
				userId.click();
				Thread.sleep(1000);
				logoutButton.click();
			}
}
