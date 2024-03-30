package handleException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAbscuredElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement CustomerServiceButton = driver.findElement(By.xpath("//div/a[text()='Customer Service']"));
		CustomerServiceButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
