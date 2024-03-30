package practice;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	
	WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
	search.sendKeys("prabh singh");
	Thread.sleep(2000);
	WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon[@class='style-scope ytd-searchbox']"));
	searchButton.click();
	Thread.sleep(2000);
	WebElement prabh = driver.findElement(By.xpath("//div[@class='style-scope ytd-video-renderer']//yt-formatted-string[text()='Prabh - 9:45 (Official Music Video)']"));
	prabh.click();
}
}
