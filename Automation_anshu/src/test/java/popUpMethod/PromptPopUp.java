package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	WebElement promptPopUp = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
	promptPopUp.click();
	Thread.sleep(1000);
	//driver.switchTo().activeElement().clear();
	//Thread.sleep(1000);
	driver.switchTo().alert().sendKeys("yes");
	String promptText = driver.switchTo().alert().getText();
	System.out.println("promptText :"+promptText);
	driver.switchTo().alert().accept();
}
}
