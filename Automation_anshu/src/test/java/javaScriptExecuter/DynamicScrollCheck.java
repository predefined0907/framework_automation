package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicScrollCheck {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Object googleDoodleHieght = jse.executeScript("return document.body.scrollHeight");
	System.out.println("googleDoodleHieght:"+googleDoodleHieght);
	driver.navigate().refresh();
    try {
		Thread.sleep(5000);
	} catch (Throwable e) {
		
	}

	Object googleDoodleHieght01 =  jse.executeScript("return document.body.scrollHeight");
	System.out.println("googleDoodleHieght01:"+googleDoodleHieght01);
	Object googleDoodlewidht = jse.executeScript("return document.body.scrollWidth");
	System.out.println("googleDoodlewidht:"+googleDoodlewidht);
	
	
}
}
