package dataDrivenTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class DataDrivenFromActiTime {
	public static WebDriver driver;
public static void main(String[] args) throws Throwable {
	
    FileInputStream file = new FileInputStream("./src/test/resources/actitimedata.properties");
    Properties pobj = new Properties();
    pobj.load(file);
	String browsername = pobj.getProperty("browser");
	System.out.println("browsername: "+browsername);
	
	if(browsername.equals("chrome"))
	{
	   driver = new ChromeDriver();
	}else if(browsername.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get(pobj.getProperty("url"));
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys(pobj.getProperty("username"));
	
	WebElement password = driver.findElement(By.name("pwd"));
	password.sendKeys(pobj.getProperty("password"));
	
	WebElement loginOption = driver.findElement(By.xpath("//div[text()='Login ']"));
	loginOption.click();	
}
}
