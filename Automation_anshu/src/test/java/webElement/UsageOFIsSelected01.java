package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOFIsSelected01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://katalon.com/sign-up");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']/../../div[@class='rc-anchor-center-container']")).click();
}
}








