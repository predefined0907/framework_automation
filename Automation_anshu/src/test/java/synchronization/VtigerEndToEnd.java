package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerEndToEnd {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));	
	
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
	WebElement userNameTextFields = driver.findElement(By.id("username"));
	userNameTextFields.clear();
	
	WebElement userNameTExtField = driver.findElement(By.id("username"));
	userNameTExtField.sendKeys("admin");
	
	WebElement passwordTextField = driver.findElement(By.id("password"));
	passwordTextField.clear();
	
	WebElement passwordTextFIeld = driver.findElement(By.id("password"));
	passwordTextFIeld.sendKeys("Test@123");
	
	WebElement signinOption = driver.findElement(By.xpath("//button[.='Sign in']"));
	signinOption.click();
	
	wait.until(ExpectedConditions.urlToBe("https://demo.vtiger.com/vtigercrm/index.php"));
	
	WebElement adminOption = driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']"));
	adminOption.click();
	
	WebElement signoutOption = driver.findElement(By.xpath("//a[.='Sign Out']"));
	wait.until(ExpectedConditions.elementToBeClickable(signoutOption));
	signoutOption.click();
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
