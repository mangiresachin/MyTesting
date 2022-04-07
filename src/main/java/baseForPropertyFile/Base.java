package baseForPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;;

public class Base {
	
		protected WebDriver driver ;
		public void launchbrowser() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("==Disable Notification==");
		driver = new ChromeDriver();
		
	   driver.get(utilityForPropertyFile.Utility.getDatafromPropertyfile("URL"));


	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		Reporter.log("Launching Browser",true);	
		}
		
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser Closing",true);
	}

}
