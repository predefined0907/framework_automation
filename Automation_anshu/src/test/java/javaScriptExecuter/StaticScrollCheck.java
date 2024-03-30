package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticScrollCheck {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	long fbHieght =  (Long) jse.executeScript("return document.body.scrollHeight");
	System.out.println("fbHieght"+fbHieght);
	long fbWidth =  (Long) jse.executeScript("return document.body.scrollWidth");
	System.out.println("fbWidth"+fbWidth);
	driver.navigate().refresh();
	long fbHieght01 =  (Long) jse.executeScript("return document.body.scrollHeight");
	System.out.println("fbHieght01:"+fbHieght01);
	long fbWidth01 = (Long) jse.executeScript("return document.body.scrollWidth");
	System.out.println("fbWidth01:"+fbWidth01);
	
}
}
