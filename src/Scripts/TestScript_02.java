package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class TestScript_02 extends Basetest_class
{
	@Test
	public void invalidlogin() {
		driver.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
		WebElement error_msg = driver.findElement(By.xpath(".//div[@class='error-message-container error']"));
		if (error_msg.isDisplayed()) {
			System.out.println(error_msg.getText());
		}

	}
}
