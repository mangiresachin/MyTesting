package testClasse;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.base;
import utilityClasses.Package;

public class KiteUsernameValidationTest extends base {
	
				kitePOMclasses.KiteLoginPOM login;
				kitePOMclasses.KitePinPOM pin;
				kitePOMclasses.KiteHomePOM home;
	@BeforeClass
	public void browserlaunch() {
		launchbrowser();
		login = new kitePOMclasses.KiteLoginPOM(driver);
		pin = new kitePOMclasses.KitePinPOM(driver);
		home = new kitePOMclasses.KiteHomePOM(driver);		
		
	}
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException  {
		login.enterlogin(Package.readdatafromExcel(0, 0));
		login.enterpassword(Package.readdatafromExcel(0, 1));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterpin(Package.readdatafromExcel(0, 2));
		pin.clickOnContinueButton();
	}
	
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException {
		String actualUserId = home.getActualuserId();
		String expectedUsedrId = Package.readdatafromExcel(0, 0);
		
		Assert.assertEquals(actualUserId, expectedUsedrId, "Actual & Expected Userd Id Not Matched");
		int TCID=100;
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		utilityClasses.Package.getScreenShot(driver, TCID);
		Package.getScreenShot(driver, TCID);
		Reporter.log("Validated User Id",true);
	}
	@AfterMethod
	public void logOutfromKite() throws InterruptedException{
	home.logOut();
		Reporter.log("Loging Out Successful",true);
	}
	@AfterClass
	public void browserclose() {
		closeBrowser();
	}
}
