package endToEnd;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver;
@Test
public void HardAssert() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	
	Assert.assertEquals(driver.getTitle(), "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	String currentURl = driver.getCurrentUrl();
	System.out.println(currentURl);
	driver.quit();
}
}
