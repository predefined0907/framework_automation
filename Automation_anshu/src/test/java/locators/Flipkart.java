package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("AT0fUR"));
		//driver.getWindowHandle().
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("8709674863");
		driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();

	}

}
