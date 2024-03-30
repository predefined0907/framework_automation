package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RectMethodOrangeHrm {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	WebElement usernameTextField = driver.findElement(By.xpath("//input[@name='username']"));
	Rectangle usernameRect = usernameTextField.getRect();
	
	int UsernameStartX = usernameRect.getX();
	System.out.println("UssernameStartX ="+UsernameStartX);
	
	int UsernameHieght = usernameRect.getHeight();
	System.out.println("UsernameHieght ="+UsernameHieght);
	
	int UsernameEndX = UsernameStartX+UsernameHieght;
	System.out.println("UsernameEndX ="+UsernameEndX);
	
	WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));
	Rectangle passwordRect = passwordTextField.getRect();
	
	int PasswordStartX = passwordRect.getX();
	System.out.println("PasswordStartX ="+PasswordStartX);
	
	int PasswordHieght = passwordRect.getHeight();
	System.out.println("PasswordHieght ="+PasswordHieght);
	
	int passwordEndX = PasswordStartX+PasswordHieght;
	System.out.println("passwordEndX ="+passwordEndX);
	
	if(UsernameEndX == passwordEndX)
	{
		System.out.println("Pass: Alignment of the username and password text field is verified and found correct");
	}else {
		System.out.println("Fail: Alignment of the username and password text field is verified and found incorrect");
	}
	
	driver.manage().window().minimize();
	driver.quit();	
}
}
