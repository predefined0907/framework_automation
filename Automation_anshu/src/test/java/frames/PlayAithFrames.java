package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayAithFrames {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.switchTo().frame("iframeResult");
	String chileText = driver.findElement(By.xpath("//body/h1")).getText();
	System.out.println("chileText"+chileText);
	driver.switchTo().parentFrame();
	String parentText = driver.findElement(By.xpath("//body/p")).getText();
	System.out.println("parentText"+parentText);
	
	
}
}
