package selectClass;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByForEach {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/signup");
	
	WebElement selectValueEle = driver.findElement(By.id("day"));
	
	Select SelectValue = new Select(selectValueEle); 
	List<WebElement> allOptions = SelectValue.getOptions();
	
	for(WebElement options:allOptions) {
		if(options.getText().equals("12"))
		{
			options.click();
			break;
		}
	}
	}
}

