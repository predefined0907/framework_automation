package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.cowin.gov.in/");
	WebElement searchOption = driver.findElement(By.xpath("//button[text()='Search']"));
	WebElement bookYourSlot = driver.findElement(By.xpath("//div[@class='precaution_child_vaccination']//a[text()='Book Your Slot']"));
	Actions actions = new Actions(driver);
	actions.scrollToElement(searchOption).pause(2000).scrollToElement(bookYourSlot).build().perform();
}
}
