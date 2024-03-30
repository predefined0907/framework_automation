package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.findElement(By.name("identifier")).sendKeys("anshusinghfire007@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@Mummy123");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Add a profile picture']")).click();
	
	//driver.findElement(By.xpath("//div[@role='checkbox']/../../..")).click();
}
}

