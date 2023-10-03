package advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender_handle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.redbus.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[@class='labelCalendarContainer']")).click();
		Thread.sleep(3000);
	
}
}