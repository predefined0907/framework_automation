package javaScriptExecuter;

import java.time.Duration;
//import java.util.Iterator;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheTargetElement  {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	for (; ; ) {
	  try {
		WebElement paraguayindependance = driver.findElement(By.xpath("//a[text()='US Teacher Appreciation Week 2023 Begins!']"));
		paraguayindependance.click();
		break;
	} catch (Exception e) {
		jse.executeScript("window.scrollBy(0,500)");
	}
	}
}	
}

