package webdrivermethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LetsKOdeIt {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.letskodeit.com/practice");
	    driver.findElement(By.id("openwindow")).click();
	    Thread.sleep(5000);
	   String window = driver.getWindowHandle();
	    driver.switchTo().window(window);
	  WebElement list = driver.findElement(By.name("categories"));
	    Select sl=new Select( list);
	    sl.selectByValue("2021");
	    driver.findElement(By.xpath("//input [@class='form-control find-input dynamic-text']")).sendKeys("java");
	   
	}

}
