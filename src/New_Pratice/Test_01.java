package New_Pratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test_01 {
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
		// rv.findElement(By.cssSelector("#addTaskButtonId")).click();
		rv.findElement(By.xpath("//*[@id=\"addTaskButtonId\"]")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//div[@class='comboboxButton'])[1]")).click();
		Thread.sleep(5000);
		rv.findElement(By.xpath(".//div[contains(text(),'- New Customer -')]")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//input[@placeholder='Enter Customer Name']")).sendKeys("Ganesh malviya");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//input[@placeholder='Enter Project Name']")).sendKeys("Selenium Batch");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[@placeholder='Enter task name'])[1]")).sendKeys("bas kar bassi");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//div[starts-with(text(),'Create Tasks')]")).click();
		Thread.sleep(3000);
	}
}