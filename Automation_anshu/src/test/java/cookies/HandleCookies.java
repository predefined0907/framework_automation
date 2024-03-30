package cookies;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.trello.qsp.genericutility.WebDriverUtility;

public class HandleCookies {
WebDriver driver;
@Test
public void handleCookies() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverUtility webDriverutils = new WebDriverUtility();

	driver.get("https://www.myntra.com/");
	Set<Cookie> allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	
	for (Cookie cookie : allCookies) {
		String cookiesName = cookie.getName();
		System.out.println(cookiesName);
	
	}
//	driver.manage().deleteAllCookies();
//	Set<Cookie> cookiesAfterDeleting = driver.manage().getCookies();
//	System.out.println(cookiesAfterDeleting.size());
	
	Date expiryDate = driver.manage().getCookieNamed("AKA_A2").getExpiry();
	System.out.println(expiryDate);
	
}
}
