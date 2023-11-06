package Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basetest_class {
	WebDriver driver;
	Properties p = new Properties();
	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		p.load(new FileInputStream("../GItHub/demo.properties"));
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	@AfterMethod
	public void testMethod(ITestResult result) {

		if (result.getStatus() == 1) {
			Reporter.log(result.getName() + "execution is pass", true);
		} else {
			Reporter.log(result.getName() + "execution is fail", true);
		}
	}

}
