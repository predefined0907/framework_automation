package webdrivermethods;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTOSubURls {

public static void main(String[] args) throws MalformedURLException, Throwable  {
	//instantiate the browser specific
	WebDriver driver=new ChromeDriver();
	//pre-condition
	driver.manage().window().maximize();
	//trigger the main url of the application
	driver.get("https://www.dassault-aviation.com/en/");
	URL mainurl=new URL("https://www.dassault-aviation.com/en/");
	URL grouppage=new URL(mainurl,"group/");
	driver.navigate().to(grouppage);
	Thread.sleep(2000);
	URL civilpage =new URL(mainurl,"civil/");
	driver.navigate().to(civilpage);
	Thread.sleep(2000);
	//post-condition
	driver.manage().window().minimize();
	
	
	
}
	}


