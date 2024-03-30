package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldDemo {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/sortable/");
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	//Thread.sleep(2000);
	WebElement dragable = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement dropable = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement draggable2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	WebElement dropapable7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	Actions actions = new Actions(driver);
	actions.clickAndHold(dragable).release(dropable).pause(2000).perform();
	actions.clickAndHold(draggable2).release(dropapable7).pause(2000).perform();
}
}
