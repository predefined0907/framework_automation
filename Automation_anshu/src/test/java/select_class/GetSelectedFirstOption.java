package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedFirstOption {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/reg/");
	
	WebElement dayDropDown = driver.findElement(By.id("day"));
	
	Select select = new Select(dayDropDown);
	String dayText = select.getFirstSelectedOption().getText();
	System.out.println("dayText :"+dayText);
}
}
