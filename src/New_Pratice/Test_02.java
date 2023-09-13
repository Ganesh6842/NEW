package New_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_02 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	 driver.get("http://demo.actitime.com/login.do");
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath(".//input[@id='username']")).sendKeys("admin");
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath(".//input[@class='textField pwdfield']")).sendKeys("manager");
	 	Thread.sleep(3000);
	 	driver.findElement(By.cssSelector("a.initial")).click();
	 	Thread.sleep(9000);
	 	driver.findElement(By.xpath(".//span[text()='New']")).click();
	 	Thread.sleep(3000);
	 	WebElement click = driver.findElement(By.xpath(".//div[@class='comboboxButton']']"));
	 	Thread.sleep(3000);
	 	click.click();
	 	Thread.sleep(3000);
	 	click.sendKeys(Keys.DOWN);
	 	Thread.sleep(3000);
	 	click.sendKeys(Keys.ENTER);
}
}
