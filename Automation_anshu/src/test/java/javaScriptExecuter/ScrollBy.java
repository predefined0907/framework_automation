package javaScriptExecuter;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBy {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://www.worldometers.info/geography/how-many-countries-are-there-in-the-world/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,2000)"); 
	
	//js.executeScript("window.scrollTo(0,500)");
	js.executeScript("window.scrollTo(0,2000)");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,1000)");
	//driver.quit();
	}

}
