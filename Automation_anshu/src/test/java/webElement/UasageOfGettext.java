package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UasageOfGettext {
public static void main(String[] args) {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1828469658%3A1689510494282759&authuser=1&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
	String expectedText = "Create account";
	System.out.println("expectedText ="+expectedText);
	
	WebElement text = driver.findElement(By.xpath("//span[.='Create account']"));
	String actualText = text.getText();
	System.out.println("actualText ="+actualText);
	
	if(actualText.equals(expectedText))
	{
		System.out.println("Pass: The text are verified and found correct");
	}else {
		System.out.println("Fail: The text are verified and found incorrect");	
	}
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}

