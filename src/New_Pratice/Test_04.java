package New_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_04 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://register.rediff.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//a[@title='Create Rediffmail Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).sendKeys("Ganesh malviya");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath(".//input[starts-with(@name,'login')]"));
		Thread.sleep(3000);
		email.sendKeys("ganesh@123");
		WebElement pwd = driver.findElement(By.xpath(".//input[@id='newpasswd']"));
		Thread.sleep(3000);
		pwd.sendKeys("admin@123");
		Thread.sleep(3000);
		pwd.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(3000);
		pwd.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(5000);
		pwd.sendKeys(Keys.TAB, Keys.CONTROL, "v");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(3000);
		email.sendKeys(Keys.TAB);
		System.out.println("first");
		Thread.sleep(5000);
		email.sendKeys(Keys.TAB);
		System.out.println("Second");
		Thread.sleep(5000);
		email.sendKeys(Keys.TAB);
		System.out.println("Thired");
		Thread.sleep(5000);
		email.sendKeys(Keys.CONTROL, "v");
		Thread.sleep(3000);

	}

}
