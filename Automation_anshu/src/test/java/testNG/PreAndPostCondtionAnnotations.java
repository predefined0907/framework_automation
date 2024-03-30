package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreAndPostCondtionAnnotations {
WebDriver driver;
@BeforeMethod
public void executeBeforeMethod() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@AfterMethod
public void executeAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();
}
@Test(priority = 1,invocationCount = 2)
public void facebook() {
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	emailTextField.sendKeys("anshu@gmail.com");
	WebElement passwordTextField = driver.findElement(By.id("pass"));
	passwordTextField.sendKeys("anshu@123");
	WebElement loginOption = driver.findElement(By.name("login"));
	loginOption.click();
}
@Test(priority = 2,dependsOnMethods = {("facebook")})
public void actiTime() {
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.sendKeys("admin");
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("passwordTextField");
	WebElement loginOption = driver.findElement(By.xpath("//div[text()='Login ']"));
	loginOption.click();
}
}
