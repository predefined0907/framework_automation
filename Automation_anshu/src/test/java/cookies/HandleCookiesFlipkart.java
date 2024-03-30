package cookies;

import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HandleCookiesFlipkart {
WebDriver driver;
@Test
public void HnadleCookies() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	
	Set<Cookie> allCokkies = driver.manage().getCookies();
	System.out.println(allCokkies.size());
	for (Cookie cookie : allCokkies) {
		String cookiesname = cookie.getName();
		System.out.println(cookiesname);
		
	}
//	driver.manage().deleteAllCookies();
//	Set<Cookie> deletedCookies = driver.manage().getCookies();
//	System.out.println(deletedCookies.size());
	
	Date expiryDate = driver.manage().getCookieNamed("K-ACTION").getExpiry();
	System.out.println(expiryDate);	
}
}
