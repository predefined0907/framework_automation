package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelExecution {
	WebDriver driver;
	@Parameters({"browser","url","username","password"})
	@Test
	public void Facebook(String browser,String url,String username,String password) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.manage().window().minimize();
		driver.quit();
	}
}
