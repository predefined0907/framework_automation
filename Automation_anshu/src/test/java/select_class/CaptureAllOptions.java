package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllOptions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/signup/");
	//Day
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select daySelect = new Select(dayDropDown);
	List<WebElement> allDayOption = daySelect.getOptions();
		
	for (WebElement dayOpt : allDayOption) {
		String dayOptText = dayOpt.getText();
	    System.out.println("dayOptText :"+dayOptText);
	    daySelect.selectByVisibleText(dayOptText);
	    if(dayOpt.isSelected()) {
	    	System.out.println("The day option is getting selected");
	    }else {
	    	System.out.println("The day option is not selected");
	    }
	}
	//Month
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropDown);
	List<WebElement> monthOption = monthSelect.getOptions();
	for (WebElement monthOpt : monthOption) {
		String monthtext = monthOpt.getText();
		System.out.println("monthtext :"+monthtext);
		monthSelect.selectByVisibleText(monthtext);
		if(monthOpt.isSelected()) {
			System.out.println("The month option is getting selected");
		}else
		{
			System.out.println("The month option is getting not selected");
		}
	}
	//Year
	WebElement yearDropDown = driver.findElement(By.id("year"));
	Select yearSelect = new Select(yearDropDown);
	List<WebElement> yearOption = yearSelect.getOptions();
	for (WebElement yearOpt : yearOption) {
		String yearText = yearOpt.getText();
		System.out.println("yearText :"+yearText);
		yearSelect.selectByVisibleText(yearText);
		if(yearOpt.isSelected()) {
			System.out.println("The year option is getting selected");
		}else
		{
			System.out.println("The year option is not getting selected");
		}
		
	}
	
}
}
