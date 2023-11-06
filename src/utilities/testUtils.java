package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Scripts.Basetest_class;
import common.BaseTest;

public class testUtils extends BaseTest{

	public void getScreenshot() throws IOException {
		Date currentDate= new Date();
		String screenshotfilename = currentDate.toString().replace(" ","-").replace(":","-");
		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File(".//screenshot//" + screenshotfilename + ".png"));
	}
}
