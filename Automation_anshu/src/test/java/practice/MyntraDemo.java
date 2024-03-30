package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraDemo {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	WebElement searchProductTextField = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	searchProductTextField.sendKeys(Keys.chord("boat headphone"));
	searchProductTextField.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h4[text()='Connectivity']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@value='Wireless']")).click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}