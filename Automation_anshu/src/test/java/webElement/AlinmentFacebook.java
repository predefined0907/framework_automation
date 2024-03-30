package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlinmentFacebook {
public static void main(String[] args) {
	//pre-condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	//Email
	WebElement EmailTextField = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
	Point LocationOfTheEmailTextField = EmailTextField.getLocation();
	
	int EmailStartY = LocationOfTheEmailTextField.getX();
	System.out.println("EmailStartX ="+EmailStartY);
	//Password
	WebElement passwordTextFiled = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Point LocationOfThepasswordTextFiled = passwordTextFiled.getLocation();
	
	int PasswordStartY = LocationOfThepasswordTextFiled.getX();
	System.out.println("PasswordStartX "+PasswordStartY);
	//condition
	if(EmailStartY == PasswordStartY )
	{
		System.out.println("Pass: Alignment of both textfield is verified and found correct");
	}
	else
	{
		System.out.println("Fail: Alignment of both textfield is verified and found incorrect");
	}
	//Post-Condition
	driver.manage().window().minimize();
	driver.quit();	
}
}
