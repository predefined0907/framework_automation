package practiceSelenium;

import java.security.Key;
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
	String titleOfTheWebPage = driver.getTitle();
	//System.out.println("titleOfTheWebPage "+titleOfTheWebPage) ;
	//driver.switchTo().activeElement().sendKeys("selenium");
	Actions action = new Actions(driver);
	action.sendKeys(driver.switchTo().activeElement()).sendKeys("selenium").sendKeys(Keys.TAB).pause(1000).sendKeys("12345").pause(1000).sendKeys(Keys.TAB)
	.pause(1000).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
}
}
