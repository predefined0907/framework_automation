package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/signup/");
	Set <String> allWid = driver.getWindowHandles();
	System.out.println(allWid);
	for(String wid : allWid)
	{
		String WidTitle = driver.switchTo().window(wid).getTitle();
		System.out.println(WidTitle);
		if(WidTitle.equals("https://www.facebook.com/signup/"))
		{
		}
		else if(WidTitle.equals("signup for facebook|facebook"))
		{
			Dimension SizeofTheWindow = driver.manage().window().getSize();
			int HeightofTheWindow = SizeofTheWindow.getHeight();
			System.out.println("Height of the WIndow "+HeightofTheWindow);
			int WidthOfTheWindow = SizeofTheWindow.getWidth();
			System.out.println("Width of the window "+WidthOfTheWindow);
			Dimension definedSize = new Dimension(200, 500);
			System.out.println("definedSize "+definedSize);
		}
		
		
	}
		
	
}
}
