package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTargetElement02 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	for (;;) {
		
	
	try {
		WebElement indiaRepublicDay = driver.findElement(By.xpath("//*[text()='India Republic Day 2023']"));
		indiaRepublicDay.click();
		break;
	} catch (Exception e) {
		jse.executeScript("window.scrollBy(0,500)");
	}
	}
}
}
