package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExcercise {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.automationexercise.com/");
	  driver.navigate().to("https://www.automationexercise.com/products");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shirt");
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
	 
	}

}
