package handleException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClickMethod {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.malaicha.com/login");
		Thread.sleep(2000);
		WebElement RegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
		RegisterButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
