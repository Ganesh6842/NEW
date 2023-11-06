package New_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testautomationpratice {
public static void main(String[] args) throws InterruptedException {
	RemoteWebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(2000);
	WebElement name_field = driver.findElement(By.id("name"));
	Thread.sleep(2000);
	name_field.sendKeys("Ganesh");
	Thread.sleep(2000);
	name_field.sendKeys(Keys.TAB,"malviya@123",Keys.TAB,"987676544",Keys.TAB,"pune");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//label[text()='Male']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//label[text()='Sunday']")).click();
	
}
}
