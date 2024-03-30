package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignmentCheck {
public static void main(String[] args) {
	//pre-condition
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//email
	WebElement emailTextfield = driver.findElement(By.id("email"));
	Point locationoftheemailTextfield = emailTextfield.getLocation();
	
	int EmailStartX = locationoftheemailTextfield.getX();
	System.out.println("EmailStartX ="+EmailStartX);
	//password
    WebElement PasswordTextField = driver.findElement(By.id("passContainer"));
    Point LocationOfthePasswordTextField = PasswordTextField.getLocation();
    
    int PasswordStartX = LocationOfthePasswordTextField.getX();
    System.out.println("PasswordStartX ="+PasswordStartX);
    
    if(EmailStartX == PasswordStartX )
    {
    	System.out.println("Pass: The right Alignement is verified and found correct");
    }
    else {
    	System.out.println("Fail: The right Alignement is verified and found incorrect");
    }
    //Post- condition
    driver.manage().window().minimize();
    driver.quit();

	
	
}
}
