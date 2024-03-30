package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckTheState {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://mdbootstrap.com/docs/standard/forms/select/");
 
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,700)");
	Thread.sleep(5000);
	WebElement mutliOption = driver.findElement(By.xpath("//section[@id='section-basic-example']//input[@class='form-control select-input placeholder-active active']"));
	Select multiSelect = new Select(mutliOption);
	if(multiSelect.isMultiple()) {
		System.out.println("The drop down is multi select");
		multiSelect.selectByIndex(0);
		Thread.sleep(1000);
		multiSelect.selectByIndex(1);
		Thread.sleep(1000);
		multiSelect.selectByIndex(2);
		Thread.sleep(1000);
		multiSelect.selectByIndex(4);
		Thread.sleep(1000);
		multiSelect.selectByIndex(7);
	}else {
		System.out.println("The drop down is not multi select");
	}
	
	
}
}
