package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	Thread.sleep(2000);
	WebElement submitOption = driver.findElement(By.name("submit"));
	if(submitOption.isEnabled())
	{
		System.out.println("Method: True");
		System.out.println("Appln: FALSE: The submit button should not be enable ");
		submitOption.click();
		Thread.sleep(2000);
	}
	else {
		System.out.println("Method: FALSE");
		System.out.println("Appln: TRUE: The submit button should be enable ");
	}
	WebElement acceptTermAndServices = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
	acceptTermAndServices.click();
	Thread.sleep(2000);
	
	WebElement confirmationOption = driver.findElement(By.id("confbtn"));
	confirmationOption.click();
	Thread.sleep(2000);
	
	WebElement closeOption = driver.findElement(By.xpath("//button[text()='Close']"));
	closeOption.click();
	Thread.sleep(2000);
	
	submitOption.click();
	Thread.sleep(2000);
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
