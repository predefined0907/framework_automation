package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropElement {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/draggable/");
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollby(0,300)");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	
	WebElement dragable = driver.findElement(By.id("draggable"));
	
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(dragable, 200, 150).perform();
}
}
