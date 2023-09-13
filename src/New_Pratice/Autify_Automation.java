package New_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autify_Automation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://app.autify.com/trial");
	Thread.sleep(2000);
	driver.findElement(By.name("first_name")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("last_name")).sendKeys("admin admin");
	Thread.sleep(2000);
	driver.findElement(By.name("company")).sendKeys("Qspider");
	Thread.sleep(2000);
	driver.findElement(By.name(".//select[@name='company_size']")).click();
	
//	size.sendKeys(Keys.ARROW_DOWN );
//	Thread.sleep(2000);
//	size.sendKeys( Keys.ARROW_DOWN);
//	Thread.sleep(2000);
//	size.sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
	System.out.println("Task completed");
	}
}
