package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleDropDown {
	
	static WebDriver driver;
	
	
public static void main(String[] args) {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/signup");
	
	WebElement dayDrpDownEle = driver.findElement(By.id("day"));
	selectOptionDropDown(dayDrpDownEle,"22");
	
	WebElement monthDropDownEle = driver.findElement(By.id("month"));
	selectOptionDropDown(monthDropDownEle,"Jun");
	
	WebElement yearDropDownEle = driver.findElement(By.id("year"));
	selectOptionDropDown(yearDropDownEle,"2020");
}


public static void selectOptionDropDown(WebElement ele,String value)
{
	Select drpDown = new Select(ele);
	
	List<WebElement> allOptions = drpDown.getOptions();
	
	for(WebElement option:allOptions) {
		if(option.getText().equals("value")) {
			
			option.click();
			break;
		}
	}
	//driver.quit();
}
}
