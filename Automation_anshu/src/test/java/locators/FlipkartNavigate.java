package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNavigate {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.className("_3704LK")).sendKeys("iphone 14pro");
	driver.findElement(By.className("L0Z3Pu")).click();
	driver.findElement(By.className("_4rR01T")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
	
	

	}

}
