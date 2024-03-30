package webdrivermethods;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSubUrl {

	public static void main(String[] args)throws MalformedURLException,InterruptedException {
		//instansiate the browser specific
		WebDriver driver=new ChromeDriver();
		//pre-condition
		driver.manage().window().maximize();
		//trigger the main url if the application
		driver.get("https://www.dassault-aviation.com/en/");
		URL mainurl =new URL("https://www.dassault-aviation.com/en/");
		URL grouppage=new URL(mainurl ,"group/");
		driver.navigate().to(grouppage);
		Thread.sleep(2000);
		URL spacepage=new URL(mainurl,"space/");
		driver.navigate().to(spacepage);
		Thread.sleep(2000);
		//post-condition
		driver.manage().window().minimize();
	}

}
