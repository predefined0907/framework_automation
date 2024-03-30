package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRahulBday {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/reg/");
	
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select daySelect = new Select(dayDropDown);
	daySelect.selectByIndex(18);
	
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropDown);
	monthSelect.selectByValue("12");
	
	WebElement yearDropDown = driver.findElement(By.id("year"));
	Select yearSelct = new Select(yearDropDown);
	yearSelct.selectByVisibleText("1996");
	
}
}
