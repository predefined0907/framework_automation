package activeElement;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterTheDataOntoActiveElement {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/");
	
	//driver.switchTo().activeElement().sendKeys("selenium");
	Actions actions = new Actions(driver);
	actions.sendKeys(driver.switchTo().activeElement()).sendKeys("selenium").sendKeys(Keys.TAB).sendKeys("123")
	.sendKeys(Keys.TAB).pause(2000).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();	
}
}
