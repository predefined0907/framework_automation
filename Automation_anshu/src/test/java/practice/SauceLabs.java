package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabs {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.saucelabs.com/am/XUI/#login");
	driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")).click();
	driver.findElement(By.xpath("//a[@title='Authenticate with Google']")).click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
