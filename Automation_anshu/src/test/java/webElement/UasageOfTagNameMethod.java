package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UasageOfTagNameMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String expectedTagName = "input";
	System.out.println("expectedTagName ="+expectedTagName);
	
	WebElement passwordtextField = driver.findElement(By.xpath("//input[@type='password']"));
	String actualTagName = passwordtextField.getTagName();
	System.out.println("actualTagName ="+actualTagName);
	
	if(actualTagName.equals(expectedTagName))
	{
		System.out.println("Pass: The Input tag name is verified and found correct");
	}
	else {
		System.out.println("Fail: The Input tag name is verified and found incorrect");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
