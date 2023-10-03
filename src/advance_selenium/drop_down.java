package advance_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver rv = new FirefoxDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);

		rv.findElement(By.id("addTaskButtonId")).click();
		Thread.sleep(5000);
		WebElement ListBox = rv.findElement(By.xpath(".//div[contains(text(),'- Select Customer -')]"));
		ListBox.click();
		List<WebElement> list = rv.findElements(By.xpath(".//div[contains(@class,'itemRow')]"));
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
		list.get(4).click();
		}
//		Robot r= new Robot();
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
		
//	
//	//	ListBox.click();
//		rv.findElement(By.xpath(".//input[@placeholder='Enter Customer Name']")).sendKeys("Dinga");Thread.sleep(2000);
//		rv.findElement(By.xpath(".//input[@placeholder='Enter Project Name']")).sendKeys("QspiderApp");Thread.sleep(2000);
//		rv.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("seleniumListBox");Thread.sleep(2000);
//		rv.findElement(By.xpath(".//div[@class='components_button withPlusIcon']")).click();Thread.sleep(2000);
//		rv.close();
//	}

//		List<WebElement> ListBox = rv.findElements(By.xpath(".//div[contains(@class,'search')]"));
//		Thread.sleep(2000);
//		System.out.println(ListBox.size());
//		for(int i=0;i<ListBox.size();i++) {
//			System.out.println(ListBox.get(i).getText());
//		}
//		ListBox.click();
//		Robot tgt = new Robot();
//		tgt.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		tgt.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		tgt.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		tgt.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		tgt.keyPress(KeyEvent.VK_ENTER);
//
//		// ListBox.click();
//		rv.findElement(By.xpath(".//input[@placeholder='Enter Customer Name']")).sendKeys("Dinga");
//		Thread.sleep(2000);
//		rv.findElement(By.xpath(".//input[@placeholder='Enter Project Name']")).sendKeys("QspiderApp");
//		Thread.sleep(2000);
//		rv.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("seleniumListBox");
//		Thread.sleep(2000);
//		rv.findElement(By.xpath(".//div[@class='components_button withPlusIcon']")).click();
//		Thread.sleep(2000);
		rv.close();
	}

}
