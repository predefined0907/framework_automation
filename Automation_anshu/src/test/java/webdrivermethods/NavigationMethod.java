package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws Throwable {
		//instantiate the browser specific class
        WebDriver driver=new ChromeDriver();
        //pre condition
        driver.manage().window().maximize();
        // trigger the url
        driver.get("https://www.dassault-aviation.com/en/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.dassault-aviation.com/en/group/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.dassault-aviation.com/en/space/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        // post condition
        driver.manage().window().minimize();
	}

}
