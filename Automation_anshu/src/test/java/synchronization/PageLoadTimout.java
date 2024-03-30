package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import net.bytebuddy.implementation.bytecode.Duplication;

public class PageLoadTimout {
public static void main(String[] args) {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	try {
	driver.get("https://www.myntra.com/");
	} catch (Exception e) {
		System.out.println("Fail the appln is not having the capcity to load within the specified time.");
	}
		

	
}
}
