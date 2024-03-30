package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	
	WebElement draggable = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	WebElement droppable = driver.findElement(By.id("droppable"));
	
	Actions actions = new Actions(driver);
	actions.clickAndHold(draggable).release(droppable).perform();
}
}
