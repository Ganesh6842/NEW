package XyzBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
		Thread.sleep(2000);
		WebElement name_option = driver.findElement(By.id("userSelect"));
		name_option.click();
		Select s = new Select(name_option);
		Thread.sleep(2000);
		s.selectByVisibleText("Harry Potter");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[text()='Login']")).click();
	}

}
