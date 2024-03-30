package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	WebElement alertBox = driver.findElement(By.name("alertbox"));
	alertBox.click();
	String alertText = driver.switchTo().alert().getText();
	System.out.println("alertText : "+alertText);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	WebElement confirmation = driver.findElement(By.name("confirmalertbox"));
	confirmation.click();
	String confirmationText  = driver.switchTo().alert().getText();
	System.out.println("confirmationText :" +confirmationText);
	driver.switchTo().alert().dismiss();
	Thread.sleep(1000);
	WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
	prompt.click();
	driver.switchTo().alert().sendKeys("yes");
	String promptText = driver.switchTo().alert().getText();
	System.out.println("promptText :"+promptText);
	driver.switchTo().alert().accept();
	driver.quit();
}
}
