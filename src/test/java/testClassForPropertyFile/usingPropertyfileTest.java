package testClassForPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseForPropertyFile.Base;
import kitePOMclasses.KiteHomePOM;
import kitePOMclasses.KiteLoginPOM;
import kitePOMclasses.KitePinPOM;
import utilityForPropertyFile.Utility;

public class usingPropertyfileTest extends Base {
	KiteLoginPOM login;
	KitePinPOM Pin;
	KiteHomePOM home;
	int TCID = 505;
	
	@BeforeClass
  public void launchingBrowser() throws IOException, InterruptedException {
	  launchbrowser();
	  login = new KiteLoginPOM(driver);
	  Pin =new KitePinPOM(driver);
	  home = new KiteHomePOM(driver);
  }
	@BeforeMethod
	public void loginToKite () throws IOException, InterruptedException {
		login.enterlogin(Utility.getDatafromPropertyfile("UN"));
		login.enterpassword(Utility.getDatafromPropertyfile("PWD"));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Pin.enterpin(Utility.getDatafromPropertyfile("PIN"));
		Pin.clickOnContinueButton();		
	}
	@Test
	public void validateUserId() throws InterruptedException, IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
		String expectedUserId = Utility.getDatafromPropertyfile("UN2");  //to fail use wrong ID in UN2
		String actualUserId = home.getActualuserId();
		
		Assert.assertEquals(actualUserId, expectedUserId, "Not Matching Ids");
		
		Utility.getScreenShot(driver, TCID);
	}
	@AfterMethod                                     //for taking failed TC screenShot
	public void loginOut() throws InterruptedException {
		home.logOut();
	}
//	@AfterMethod
//	public void loGouT(ITestResult result) throws IOException {
//		if (result.getStatus()==ITestResult.FAILURE) {
//			Utility.getScreenShot(driver, TCID);
//		}
//		else  {
//			Reporter.log("TC is Passed",true);
//			
//		}
//	}
	@AfterClass
	public void closingBrowser() {
		closeBrowser();
	}
}
