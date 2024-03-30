package webdrivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookNavigation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("987654321");
		driver.findElement(By.id("pass")).sendKeys("mahadev");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[@class='_97w4']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("123456987");
		driver.findElement(By.id("did_submit")).click();
		
	}

}
