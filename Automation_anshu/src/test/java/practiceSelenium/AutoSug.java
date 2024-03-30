package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSug {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.co.uk/");
	driver.switchTo().activeElement().sendKeys("virat");
	List<WebElement> autoSug = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
	for (WebElement sug : autoSug) {
		String sugText = sug.getText();
		System.out.println(sugText);
		if(sugText.contains("birthday")) {
			sug.click();
			break;
		}
		
	}
}
}
