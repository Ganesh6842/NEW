package applications_qspiderds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoappsqspiders {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://demoapps.qspiders.com/");
		Thread.sleep(2000);
		WebElement tgt_ele = driver.findElement(By.id("name"));
		tgt_ele.sendKeys("admin");
		System.out.println(tgt_ele.getAttribute("placeholder") + "-->" + tgt_ele.getAttribute("value"));
		Thread.sleep(2000);
		WebElement email_field = driver.findElement(By.id("email"));
		email_field.sendKeys("admin@123gmail.com");
		System.out.println(email_field.getAttribute("placeholder") + "-->" + email_field.getAttribute("value"));
		Thread.sleep(2000);
		WebElement psw_field = driver.findElement(By.id("password"));
		psw_field.sendKeys("admin123456");
		System.out.println(psw_field.getAttribute("placeholder") + "-->" + psw_field.getAttribute("value"));
		Thread.sleep(2000);
//	driver.findElement(By.xpath(".//span[text()='Login']")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);

	}
}
