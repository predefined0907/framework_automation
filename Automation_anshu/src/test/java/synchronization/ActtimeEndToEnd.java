package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActtimeEndToEnd {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement userNameTextField = driver.findElement(By.id("username"));
	userNameTextField.sendKeys("admin");
	
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("manager");
	
	WebElement loginOption = driver.findElement(By.xpath("//div[.='Login ']"));
	loginOption.click();
	Thread.sleep(2000);
	String actualHomepageURL = driver.getCurrentUrl();
	if(actualHomepageURL.equals("https://demo.actitime.com/user/submit_tt.do")) {
		WebElement logoutOption = driver.findElement(By.xpath("//a[.='Logout']"));
		System.out.println("The actualHomepageURL is as per expected ");
	if(logoutOption.isDisplayed())
	{
		logoutOption.click();
		System.out.println("The logoutOption is displayed");
	}else {
		System.out.println("The logoutOption is not displayed");
	}}
	else {
		System.out.println("The actualHomepageURL is not as per expeected");
	}
	driver.manage().window().minimize();
	driver.quit();
	}	
}

