package New_Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automationteststore {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://automationteststore.com/");
		Thread.sleep(2000);
		String str = "img";
		WebElement logo = driver.findElement(By.xpath(".//img"));
		String logo1 = logo.getTagName();
		System.out.println(logo1);
		if(logo1.equals(str))
			System.out.println("img tag");
		
		List<WebElement> productname = driver.findElements(By.xpath(".//a[@class='prdocutname']"));
		List<WebElement> productprice = driver.findElements(By.xpath(".//div[@class='pricetag jumbotron']"));
		for(int i=0;i<productname.size();i++) {
		     String proname = productname.get(i).getText();
		                String price = productprice.get(i).getText();
		                System.out.println(proname+ "-->"+price );
		
		}
	}
	
}
