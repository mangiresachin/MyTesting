package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class base {
	protected WebDriver driver;
	public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("==Disable Notification==");
	driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/#loggedout");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	
	Reporter.log("Launching Browser",true);	
	}
	
public void closeBrowser() {
	driver.close();
//	driver.get("https://kite.zerodha.com/#loggedout");
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	driver.manage().window().maximize();
	Reporter.log("Browser Closing",true);
}
}
