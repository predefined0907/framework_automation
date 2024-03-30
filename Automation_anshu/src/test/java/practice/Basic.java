package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws Throwable {
    
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    //WebElement loginbutton = driver.findElement(By.name("login"));
    //loginbutton.click();
    driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("99874563210");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
