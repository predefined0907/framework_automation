package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	if(emailTextField.isDisplayed())
	{
		System.out.println("Method: TRUE");
		System.out.println("Appln: TRUE : EmailtextField should be visible in the webpage");
		emailTextField.sendKeys("anshusinghfire007");
	}
	else {
		System.out.println("Method: FALSE");
		System.out.println("Appln: FALSE : EmailtextField should not be visible in the webpage");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
