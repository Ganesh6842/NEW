package New_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_03 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(3000);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.name("username"));
	int userH = user.getRect().getHeight();
	int userW = user.getRect().getWidth();
	WebElement pwd = driver.findElement(By.name("password"));
	int pwdH = pwd.getRect().getHeight();
	int pwdW = pwd.getRect().getWidth();
	if(userH==pwdH&&userW==pwdW) {
		System.out.println("Both are same");
	}else {
		System.out.println("Both  are not same");
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	Thread.sleep(3000);
	WebElement error = driver.findElement(By.xpath(".//span[text()='Required']"));
	if(error.isDisplayed()) {
		System.out.println("error msg displayed");}
	else {
		System.out.println("error msg not displayed");
	}
	
	String errorcolor = error.getCssValue("color");
	System.out.println("errorcolor:"+ errorcolor);
	
	String errorfontsize = error.getCssValue("font-size");
	System.out.println("Errorsize:"+errorfontsize);
	
	driver.quit();
	System.out.println("task completed");
	
}
}
