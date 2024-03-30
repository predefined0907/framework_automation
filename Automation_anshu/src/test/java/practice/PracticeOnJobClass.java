package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnJobClass {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://106.51.87.42:9008/?d=IN");
	
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("http://106.51.87.42:9008/signup");
	
	Thread.sleep(2000);
	
	WebElement genderSelectOption = driver.findElement(By.xpath("//span[@id='select2-gender-container']"));
	genderSelectOption.click();
   
	WebElement MrOption = driver.findElement(By.xpath("//li[contains(text(),\"Mr\")]/.."));
	MrOption.click();
	
	WebElement nameTextField = driver.findElement(By.xpath("//input[@name='name']"));
	nameTextField.sendKeys(Keys.chord("Anshu"));
	
	WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio']/../.."));
	radioButton.click();
	
	WebElement phoneNumberTextField = driver.findElement(By.xpath(" //input[@placeholder='Phone Number']"));
	phoneNumberTextField.sendKeys("8709674863");
	
	WebElement emailTextField = driver.findElement(By.xpath("//input[@id='email']"));
	emailTextField.sendKeys("anshukumarsingh786@gmail.com");
	
	WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));
	passwordTextField.sendKeys("@Mahadev123");
	
	WebElement pwdConfirmatinTExtField = driver.findElement(By.xpath("//input[@name='password_confirmation']"));
	pwdConfirmatinTExtField.sendKeys("@Mahadev123");
	
	driver.findElement(By.xpath("//input[@name='term']")).click();
	
	Thread.sleep(2000);
	
	WebElement registerButton = driver.findElement(By.xpath("//button[text()=' Register ']"));
	registerButton.sendKeys(Keys.ENTER);
	
	Thread.sleep(2000);
	
	//driver.manage().window().minimize();
	//driver.quit();
	
	
}
}
