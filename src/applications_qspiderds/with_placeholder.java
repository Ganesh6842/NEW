package applications_qspiderds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class with_placeholder {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//li[text()='Resizable Text Area']")).click();
	Thread.sleep(2000);
	WebElement name_field = driver.findElement(By.xpath(".//textarea[@id='name']"));
//	System.out.println(name_field.getLocation().getX());
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	Thread.sleep(2000);
//	a.moveToElement(name_field).perform();
	Thread.sleep(2000);
	a.dragAndDropBy(name_field,130,0).perform();
	System.out.println("task");
}
}
