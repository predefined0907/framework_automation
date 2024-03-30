package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeCheck {
public static void main(String[] args) {
	//pre - condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//email
	WebElement emailTextField = driver.findElement(By.id("email"));
	Dimension sizeOfTheemailTextField = emailTextField.getSize();
	
	int hieghtOftheEmailTextField = sizeOfTheemailTextField.getHeight();
	System.out.println("hieghtOftheEmailTextField = "+hieghtOftheEmailTextField);
	
	int widthofTheEmailTextField = sizeOfTheemailTextField.getWidth();
	System.out.println("widthofTheEmailTextField = " +widthofTheEmailTextField);
	
	//password
	
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Dimension sizeOfThePasswordTExtField = passwordTextField.getSize();
	
	int hieghtOfthePasswordTExtField = sizeOfThePasswordTExtField.getHeight();
	System.out.println("hieghtOfthePasswordTExtField = "+hieghtOfthePasswordTExtField);
	
	int widthOfthePasswordTExtField = sizeOfThePasswordTExtField.getWidth();
	System.out.println("widthOfthePasswordTExtField = "+widthOfthePasswordTExtField);
	
	//verify and validate
	
	if(hieghtOftheEmailTextField == hieghtOfthePasswordTExtField && widthofTheEmailTextField == widthOfthePasswordTExtField)
	{
		System.out.println("pass : The hieghtOftheEmailTextField and hieghtOfthePasswordTExtField and also widthofTheEmailTextField and widthOfthePasswordTExtField is verified and found correct ");
	}
	else {
		System.out.println("fail : The hieghtOftheEmailTextField and hieghtOfthePasswordTExtField and also widthofTheEmailTextField and widthOfthePasswordTExtField is verified and found incorrect ");	
	
}
	//post-condition
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}