package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeEndToEndWait {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); 
	
	driver.get("https://demo.actitime.com/login.do");
	WebElement userNameTextField = driver.findElement(By.name("username"));
	userNameTextField.sendKeys("admin");
	
	WebElement passwordTextfield = driver.findElement(By.name("pwd"));
	passwordTextfield.sendKeys("manager");
	
	WebElement loginOption = driver.findElement(By.xpath("//div[.='Login ']"));
	loginOption.click();

	wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
	WebElement logoutLink = driver.findElement(By.id("logoutLink"));

	wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
	logoutLink.click();
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
