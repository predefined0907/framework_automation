package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	WebElement userNameTextField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	String Usernameplaceholder = userNameTextField.getAttribute("placeholder");
	System.out.println("Usernameplaceholder "+ Usernameplaceholder);
	userNameTextField.sendKeys("admin");
	
}
}
