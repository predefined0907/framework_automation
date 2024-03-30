package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromFacebookData {
	public static WebDriver driver;
public static void main(String[] args) throws IOException, Throwable {
	
	FileInputStream file = new FileInputStream("./src/test/resources/facebookdata.properties");
	
	Properties pobj = new Properties();
	pobj.load(file);
	
	String browsername = pobj.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		driver = new ChromeDriver();
	}else if (browsername.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if (browsername.equals("edge")) {
		driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get(pobj.getProperty("url"));
	Thread.sleep(2000);
	WebElement emailTextField = driver.findElement(By.id("email"));
	emailTextField.sendKeys(pobj.getProperty("username"));
	Thread.sleep(2000);
	WebElement passwordTextField = driver.findElement(By.id("pass"));
	passwordTextField.sendKeys(pobj.getProperty("password"));
	Thread.sleep(2000);
	WebElement loginButton = driver.findElement(By.name("login"));
	loginButton.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.close();
}
}
