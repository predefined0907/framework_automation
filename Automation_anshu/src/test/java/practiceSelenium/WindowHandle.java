package practiceSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/signup/");
	
	Set<String> allwid = driver.getWindowHandles();
	System.out.println(allwid);
    
	for (String wid : allwid) {
		String widTitle = driver.switchTo().window(wid).getTitle();
		System.out.println(widTitle);
		if(widTitle.equals("https://www.facebook.com/signup/")) {
			
		}else if (widTitle.equals("Sign up for Facebook | Facebook")) {
			Dimension sizeOfTheWindow = driver.manage().window().getSize();
			int hieghtOfTheWindow = sizeOfTheWindow.getHeight();
			System.out.println("hieghtOfTheWindow "+hieghtOfTheWindow);
			int widthOfTheWindow = sizeOfTheWindow.getWidth();
            System.out.println("widthOfTheWindow "+widthOfTheWindow);
            Dimension definedSize = new Dimension(200, 500);
            System.out.println("definedSize "+definedSize);
		}
	}
		
	driver.manage().window().minimize();
	driver.quit();
}
}
