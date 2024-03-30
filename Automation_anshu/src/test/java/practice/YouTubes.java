package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubes {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.youtube.com/");
	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("laal ghaghra");
	search.sendKeys(Keys.ENTER);
	WebElement laalGhaghra = driver.findElement(By.xpath("//div[@class='style-scope ytd-video-renderer']//yt-formatted-string[text()='#Video | #Pawan Singh New Song | लाल घाघरा | Lal Ghaghra | Shilpi Raj | Namrita Malla| Bhojpuri Gana']"));
	laalGhaghra.click();
}
}
