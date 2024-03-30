package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckTheDropDownState {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/reg/");
	
	WebElement dayDropDwon = driver.findElement(By.id("day"));
	
	Select daySelect = new Select(dayDropDwon);
	if(daySelect.isMultiple())
	{
		System.out.println("The day drop down is multi select");
	}else {
		System.out.println("The day drop down is single select");
	}
	
}
}
