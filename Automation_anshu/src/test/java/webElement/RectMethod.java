package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RectMethod {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement emailTextField = driver.findElement(By.id("email"));
	Rectangle EmailRect = emailTextField.getRect();
	
	int EmailStartX = EmailRect.getX();
	System.out.println("EmailStartX "+EmailStartX);
	
	int EmailWidth = EmailRect.getWidth();
	System.out.println("EmailWidth ="+EmailWidth);
	
	int emailEndX = EmailStartX+EmailWidth;
	System.out.println("emailEndX ="+emailEndX);
	
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Rectangle passwordRect = passwordTextField.getRect();
	
	int passwordStartX = passwordRect.getX();
	System.out.println("passwordStartX ="+ passwordStartX);
	
	int passwordWidth = passwordRect.getWidth();
	System.out.println("passwordWidth ="+passwordWidth);
	
	int PasswordEndX = passwordStartX+passwordWidth;
	System.out.println("PasswordEndX ="+PasswordEndX);
	
	if(emailEndX == PasswordEndX)
	{
		System.out.println("Pass : Alignment of email and password text field is verified and found correct");
	}else {
		System.out.println("Fail : Alignment of email and password text field is verified and found incorrect");
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
