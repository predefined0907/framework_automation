package handleException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleElementNotIntrectable {

	public static void main(String[] args) {
		//ElementNotIntrectable--Run--Unchecked--sel
		//When the element is not in there in the web page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement TshirtOption = driver.findElement(By.xpath("//a[@href='/men-tshirts']"));
		TshirtOption.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
