package handleException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesAbscuredElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		//Thread.sleep(2000);
		WebElement WomentEthicButton = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		WomentEthicButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
