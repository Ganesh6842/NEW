package New_Pratice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mock {
public static void main(String[] args) throws InterruptedException {
	RemoteWebDriver rv = new FirefoxDriver();
//	driver.get("https://www.facebook.com/");
	rv.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	
}
}
