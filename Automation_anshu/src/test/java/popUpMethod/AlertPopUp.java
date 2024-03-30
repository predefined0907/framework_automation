package popUpMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	WebElement alertPopUp = driver.findElement(By.xpath("//button[text()='Alert Box']"));
	alertPopUp.click();
	Thread.sleep(1000);
	String alertText = driver.switchTo().alert().getText();
	System.out.println("alertText :"+alertText);
	driver.switchTo().alert().accept();
}
}
