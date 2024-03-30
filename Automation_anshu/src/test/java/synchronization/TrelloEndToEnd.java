 package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloEndToEnd {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://trello.com/login");
	
	WebElement usernameTextField = driver.findElement(By.id("user"));
	usernameTextField.sendKeys("anshusinghfire007@gmail.com");
	
	WebElement submitButton = driver.findElement(By.xpath("//input[@type= 'submit']"));
	submitButton.submit();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/login?application=trello&continue=h"));
	WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));
	passwordTextField.sendKeys("@Mummy123");
	WebElement loginOption = driver.findElement(By.xpath("//button[@id='login-submit']"));
	loginOption.click();
	
	
	WebElement usernameOption = driver.findElement(By.xpath("//span[@title='Anshu Singh (anshusinghfire007)']"));
	wait.until(ExpectedConditions.urlToBe("https://trello.com/u/anshusinghfire007/boards"));
	usernameOption.click();
	
	WebElement logOutOption = driver.findElement(By.xpath("//span[.='Log out']"));
	logOutOption.click();
	String actualLogOutPage = driver.getCurrentUrl();
	if(actualLogOutPage.contains("https://id.atlassian.com/logout?continue="))
	{
		WebElement logoutbutton = driver.findElement(By.xpath("//button[@id='logout-submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
		logoutbutton.submit();
		System.out.println("The log out submit page is as per expected");
	}
	else {
		System.out.println("The log out submit page is not as per expected");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
