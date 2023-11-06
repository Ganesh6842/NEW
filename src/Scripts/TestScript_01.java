package Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestScript_01 extends Basetest_class
{
	@Test
	public void login() {
		driver.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
	}
}
