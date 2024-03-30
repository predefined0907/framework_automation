package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='Men']")).click();
		driver.findElement(By.xpath("//a[text()='Jackets']/../../..//li[@data-reactid=\"28\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='HRX by Hrithik Roshan Men Olive Green Solid Active Bomber Jacket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		//driver.manage().window().minimize();
		//driver.quit();
	}

}
