package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PeaAndPostCondition {

	public static void main(String[] args) throws Throwable {
     //instantiate the browser specific class 
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		//pre-condition
       driver.manage().window().maximize();
       Thread.sleep(1000);
       //trigger the main url if the application
       driver.get("https://www.dassault-aviation.com/en/");
       Thread.sleep(1000);
       driver.manage().window().fullscreen();
       Thread.sleep(1000);
       //post condtion
       driver.manage().window().maximize();
	}

}
