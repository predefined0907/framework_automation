package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTripBookFlightTicket {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(5000);
	//WebElement cutcross = driver.findElement(By.xpath("//a[@class='close']//i[@class='wewidgeticon we_close']"));
	//cutcross.click();
	
	//WebElement phnText = driver.findElement(By.xpath("//input[@class='font14 fullWidth']"));
	//phnText.sendKeys("8709674863");
	
	WebElement fromOption = driver.findElement(By.id("fromCity"));
	fromOption.click();
	WebElement fromOptions = driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup']//input[@type='text']"));
	fromOptions.sendKeys("bengaluru");
	
	WebElement banglore = driver.findElement(By.xpath("//p[text()='Bengaluru, India']"));
	banglore.click();
	
	WebElement toOption = driver.findElement(By.xpath("//span[text()='To']"));
	toOption.click();
	
	WebElement toOptions = driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween']//input[@type='text']"));
	toOptions.sendKeys("ranchi");
	
	WebElement ranchi = driver.findElement(By.xpath("//p[text()='Ranchi, India']"));
	ranchi.click();
	
	WebElement datePicker = driver.findElement(By.xpath("//div[@aria-label='Mon Sep 04 2023']"));
	datePicker.click();
	
	WebElement searchOption = driver.findElement(By.xpath("//a[.='Search']"));
	searchOption.click();
	Thread.sleep(12000);
	WebElement crossoption = driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
	crossoption.click();
	Thread.sleep(2000);
	
	//WebElement viewPrice = driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:0938350b-6d19-43f9-a8ad-c7908032bc46:3_0']/span[@class='customArrow arrowDown']"));
	//viewPrice.click();
	WebElement viewPrice = driver.findElement(By.xpath("//p[text()='I5 1621']/../ancestor::div[@class='makeFlex spaceBetween']//div[@class='priceSection']/div/button/span[@class='customArrow arrowDown']"));
	viewPrice.click();
	
	WebElement bookNow = driver.findElement(By.xpath("//div[@class='viewFareBtnCol  ']//button[.='Book Now']"));
	bookNow.click();
	Thread.sleep(4000);
	
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("document.body.scrollBy(0,800)");
	
	//WebElement radioButton = driver.findElement(By.xpath("//div[@class='insBottomSection']//input[@type='radio']"));
	//radioButton.click();
	
	driver.findElement(By.xpath("//div[@class='dropdown__indicator dropdown__dropdown-indicator css-1eew81i']")).click();
	
	
	
	
	
	
}
}

