package sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataByUsingEnum {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		WebElement userNameTextfield = driver.findElement(By.id("user-name"));
		userNameTextfield.sendKeys(Keys.chord("standard_user"));
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys(Keys.chord("secret_sauce"));
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.sendKeys(Keys.ENTER);
		driver.manage().window().minimize();
		driver.quit();
	}
	

}
