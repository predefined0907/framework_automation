package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoEndToEnd {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement userNameTextField = driver.findElement(By.name("username"));
	userNameTextField.sendKeys("admin");
	
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("manager");
	
	WebElement loginOption = driver.findElement(By.xpath("//div[.='Login ']"));
	loginOption.click();
	Thread.sleep(2000);
	String actualHomePageUrl = driver.getCurrentUrl();
	if(actualHomePageUrl.equals("https://demo.actitime.com/user/submit_tt.do"))
	{
		WebElement logoutLink = driver.findElement(By.xpath("//a[.='Logout']"));
	    System.out.println("The actualHomePageUrl is as per expected");
	if(logoutLink.isDisplayed()){
	    	logoutLink.click();
	    	System.out.println("logoutLink is dispalyed");
	    } else {
	    	System.out.println("logoutLink is not dsiplayed");
	    }
	     }else {
	    	System.out.println("The actualHomePageUrl is not as per expected");
	    }
	driver.manage().window().minimize();
	driver.quit();
	    
	
}
	
}

