package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TravelRromOneToAnother {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	
	WebElement menOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	WebElement womenOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
	WebElement kidsOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
	WebElement homeAndLivingOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
	WebElement beautyOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
	WebElement studioOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
	
	Actions actions = new Actions(driver);	
	//actions.moveToElement(menOption, 0, 0).pause(1000).moveToElement(menOption, 75, 0).pause(1000).moveToElement(womenOption, 76, 0).pause(1000)
    //.moveToElement(kidsOption, 99, 0).pause(1000).moveToElement(homeAndLivingOption, 108, 0).pause(1000).moveToElement(beautyOption, 84, 0).perform();
	//actions.moveToElement(menOption, 0, 0).pause(1000).moveToElement(menOption, 75, 0).pause(1000).moveToElement(menOption, 150, 0).pause(1000)
	//.moveToElement(menOption, 248, 0).pause(1000).moveToElement(menOption, 356, 0).pause(1000).moveToElement(menOption, 420, 0).perform();
	actions.moveToElement(menOption).pause(1000).moveToElement(womenOption).pause(1000).moveToElement(kidsOption).pause(1000)
	.moveToElement(homeAndLivingOption).pause(1000).moveToElement(beautyOption).pause(1000).moveToElement(studioOption).perform();
    actions.moveToElement(menOption).pause(1000).click().perform();
    //Thread.sleep(2000);
    //driver.navigate().to("https://www.myntra.com/");
    //Thread.sleep(2000);
    //actions.moveToElement(menOption).pause(1000).moveToElement(womenOption).perform();
  
	}
}
