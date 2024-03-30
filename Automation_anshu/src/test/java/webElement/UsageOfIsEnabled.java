package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	if(loginButton.isEnabled())
	{
		System.out.println("Method: TRUE");
		System.out.println("Application: The loginButton should be in enabled state");
		loginButton.submit();
	}
	else {
		System.out.println("Method: FALSE");
		System.out.println("Application: The loginButton should not be in enabled state");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
