package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String expectedResult = "Forgotten password?";
	System.out.println("expectedResult ="+expectedResult);
	
	WebElement forgottenPasswordTagText = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
	String ActulTagtext = forgottenPasswordTagText.getText();
	System.out.println("ActulTagtext ="+ActulTagtext);
	
	if(ActulTagtext.equals(expectedResult))
	{
		System.out.println("Pass: The tag text is verified and found correct");
	}
	else {
		System.out.println("Fail: The tag text is verified and found incorrect");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
