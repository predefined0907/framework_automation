package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='tryhtml5_draganddrop_ifr.htm']")));
	WebElement Box1 = driver.findElement(By.xpath("//img[@id='drag1']"));
	WebElement box2 = driver.findElement(By.id("div2"));
	Actions action = new Actions(driver);
	action.dragAndDrop(Box1, box2).perform();



}
}
