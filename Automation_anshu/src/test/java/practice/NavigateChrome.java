package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateChrome {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("www.facebook.com");
	}

}
