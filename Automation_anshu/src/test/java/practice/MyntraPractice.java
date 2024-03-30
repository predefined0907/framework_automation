package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraPractice {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.myntra.com/men-sweatshirts");
	
	WebElement sweatShirt = driver.findElement(By.xpath("//img[@alt='H&M Men Black Relaxed Fit Hoodie']"));
	sweatShirt.click();
	
	
}
}
