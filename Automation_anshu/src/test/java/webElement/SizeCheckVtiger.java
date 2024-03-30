package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeCheckVtiger {
public static void main(String[] args) {
	// pre-condition
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// email
	
	WebElement userNameTextField = driver.findElement(By.name("username"));
	Dimension sizeOftheuserNameTextField = userNameTextField.getSize();
	
	int hieghtoftheuserNameTextField = sizeOftheuserNameTextField.getHeight();
	System.out.println("hieghtoftheuserNameTextField = "+ hieghtoftheuserNameTextField);
	
	int widthoftheuserNameTextField = sizeOftheuserNameTextField.getWidth();
	System.out.println("widthoftheuserNameTextField = "+widthoftheuserNameTextField);
	
	//password
	
	WebElement passwordTextField = driver.findElement(By.name("password"));
	Dimension sizeofthepasswordTextField = passwordTextField.getSize();
	
	int hieghtofthepasswordTextField = sizeofthepasswordTextField.getHeight();
	System.out.println("hieghtofthepasswordTextField =" +hieghtofthepasswordTextField);
	
	int widthofthepasswordTextField = sizeofthepasswordTextField.getWidth();
	System.out.println("widthofthepasswordTextField = "+widthofthepasswordTextField);
	
	//condition
	if(hieghtoftheuserNameTextField == hieghtofthepasswordTextField && widthoftheuserNameTextField == widthofthepasswordTextField ) {
		System.out.println("Pass :The hieghtoftheuserNameTextField and hieghtofthepasswordTextField and also widthoftheuserNameTextField and widthofthepasswordTextField if verified and found correct");
	}
	else
	{
		System.out.println("fail :The hieghtoftheuserNameTextField and hieghtofthepasswordTextField and also widthoftheuserNameTextField and widthofthepasswordTextField if verified and found incorrect");
	}
	//post-condition
	driver.manage().window().minimize();
	driver.quit();
	}		
}
