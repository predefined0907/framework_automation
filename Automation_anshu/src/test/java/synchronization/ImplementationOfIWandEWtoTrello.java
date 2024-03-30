package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementationOfIWandEWtoTrello {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://trello.com/");
	
	WebElement loginOption = driver.findElement(By.xpath("//a[text()='Get Trello for free']/preceding-sibling::a[text()='Log in']"));
	loginOption.click();
	wait.until(ExpectedConditions.urlToBe("https://trello.com/login"));
	WebElement usernameTextfield = driver.findElement(By.id("user"));
	usernameTextfield.sendKeys("anshusinghfire007@gmail.com");
	WebElement LoginsubmitButton = driver.findElement(By.xpath("//input[@type='submit']"));
	LoginsubmitButton.click();
	wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/login?application=trello&continue=https"));
	WebElement passwordTextField = driver.findElement(By.name("password"));
	passwordTextField.sendKeys("@Mummy123");
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	loginButton.submit();
	
	wait.until(ExpectedConditions.urlToBe("https://trello.com/u/anshusinghfire007/boards"));
	WebElement titleofthepage = driver.findElement(By.xpath("//span[@title='Anshu Singh (anshusinghfire007)']"));	
	titleofthepage.click();
	WebElement logoutOption = driver.findElement(By.xpath("//span[text()='Log out']"));
	logoutOption.click();
	
	wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/logout?continue="));
	WebElement confirmlogout = driver.findElement(By.xpath("//button[@id='logout-submit']"));
	wait.until(ExpectedConditions.elementToBeClickable(confirmlogout));
	confirmlogout.click();
	
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
