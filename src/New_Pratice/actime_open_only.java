package New_Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actime_open_only {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new FirefoxDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		rv.findElement(By.xpath(".//div[@id='container_tasks']")).click();
		Thread.sleep(2000);
		rv.findElement(By.xpath(".//div[@class='checkbox inactive']")).click();
		Thread.sleep(2000);
		WebElement find = rv.findElement(By.xpath(".//span[@class='actual']"));
		System.out.println("total selected -->" + find.getText());
		Thread.sleep(2000);
		List<WebElement> total = rv.findElements(By.xpath(".//div[@class='namesContainer']	"));
		System.out.println(total.size());
		Thread.sleep(2000);
		rv.findElement(By.xpath(".//div[@class='checkbox active']	")).click();

		System.out.println("task completed");
	}
}
