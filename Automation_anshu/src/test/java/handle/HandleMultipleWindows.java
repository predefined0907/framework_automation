package handle;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup/");
		Set<String> allwid = driver.getWindowHandles();
		System.out.println(allwid);
		for(String wid:allwid)
		{
			String WidTitle=driver.switchTo().window(wid).getTitle();
			System.out.println(WidTitle);
			if(WidTitle.equals("facebook-login or signup"));
			{
			}
			elseif(WidTitle.equals("Signup for facebook |facebook"));
			{
				Dimension sizeofthewindow = driver.manage().window().getSize();
				int heightofthewindow = sizeofthewindow.getHeight();
				System.out.println("Height of the window= "+heightofthewindow);
				int Widthofthewindow = sizeofthewindow.getWidth();
				System.out.println("Widthe of the window= "+Widthofthewindow);
				Point positionofthewindow = driver.manage().window().getPosition();
			     int StartX = positionofthewindow.getX();
			     System.out.println(StartX);
			     int StartY = positionofthewindow.getY();
			     System.out.println(StartY);
			     Dimension definedsize=new Dimension(200, 300);
			     driver.manage().window().setSize(definedsize);
			     Thread.sleep(2000);
			     Point definedPostion=new Point(90,150);
			     driver.manage().window().setPosition(definedPostion);
			     Thread.sleep(2000);
			     driver.close();
			     driver.manage().window().minimize();
			     //driver.quit();
			
			}
		}
	}

	private static void elseif(boolean equals) {
		// TODO Auto-generated method stub
		
	}

	
		
	}
