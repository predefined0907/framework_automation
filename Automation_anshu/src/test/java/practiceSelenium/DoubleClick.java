package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	
	driver.switchTo().frame("iframeResult");
	WebElement Field1 = driver.findElement(By.id("field1"));
	Field1.clear();
	Field1.sendKeys("Hello are you afraid of me");
	WebElement copyText = driver.findElement(By.xpath("//button[text()='Copy Text']"));
	Actions action = new Actions(driver);
	action.doubleClick(copyText).perform();
	
	WebElement text = driver.findElement(By.xpath("//p[text()='A function is triggered when the button is double-clicked. The function copies the text from Field1 into Field2.']"));
	String textCopy = text.getText();
	System.out.println("textCopy :"+textCopy);
	
}
}
