package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
	WebElement confirmationPopUp = driver.findElement(By.xpath("//button[.='Confirm Alert Box']"));
	confirmationPopUp.click();
	Thread.sleep(1000);
	String confirmText = driver.switchTo().alert().getText();
	System.out.println("confirmText :"+confirmText);
	driver.switchTo().alert().dismiss();
}
}
