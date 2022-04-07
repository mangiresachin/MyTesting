package utilityForPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility {
public static void getScreenShot(WebDriver driver, int TCID) throws IOException  {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("G:\\Software Testing Course Dec21\\excelstudy\\TC"+TCID+"ScreenShot.png");
		
		org.openqa.selenium.io.FileHandler.copy(source, target);
		Reporter.log("ScreenShot Taken, Successfully for TC"+TCID,true);
	}
	
	public static String getDatafromPropertyfile(String key) throws IOException {
		Properties P = new Properties();
		 FileInputStream file = new FileInputStream("C:\\Users\\Sacsoni\\eclipse-workspace\\mavenfirst\\Myfile.properties");
		 P.load(file);
		 String value = P.getProperty(key);
		 return value;
	}

}
