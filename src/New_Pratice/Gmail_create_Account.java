package New_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_create_Account {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();Thread.sleep(3000);
	driver.get("https://www.gmail.com");Thread.sleep(3000);
	driver.findElement(By.xpath(".//span[text()='Create account']")).click();Thread.sleep(3000);
	driver.findElement(By.xpath(".//span[text()='For my personal use']")).click();Thread.sleep(3000);
	driver.findElement(By.id("firstName")).sendKeys("Ganesh");Thread.sleep(3000);
	driver.findElement(By.id("lastName")).sendKeys("Malviya");Thread.sleep(3000);
	driver.findElement(By.xpath(".//span[text()='Next']")).click();
//	driver
//	System.out.println("task");
}
}
