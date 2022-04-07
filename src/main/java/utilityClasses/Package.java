package utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Package {
	
	static Sheet Mysheet;

	public static String readdatafromExcel(int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("G:\\Software Testing Course Dec21\\excelstudy\\excelsample.xlsx");
		Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		String value = Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
	}
	
	public static void getScreenShot(WebDriver driver, int TCID) throws IOException  {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("G:\\Software Testing Course Dec21\\SeleniumScreenShotCapture\\TC"+TCID+"ScreenShot.png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
		Reporter.log("ScreenShot Taken, Successfully for TC"+TCID,true);
//		Reporter.log("ScreenShot Taken, Successfully for TC"+TCID,true);
	}

}
