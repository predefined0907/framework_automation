package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheValueAttribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		Thread.sleep(2000);
		WebElement usernameTextfield = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		String ValueOfUSernameTextfield = usernameTextfield.getAttribute("name");
		Thread.sleep(2000);
		if(ValueOfUSernameTextfield.isEmpty())
		{
			System.out.println("Acording to method: True---The data should not be present.");
			System.out.println("According to Cust Req: The data should not be present");
			usernameTextfield.sendKeys("admin");
		}else {
			System.out.println("According to Method : False---The data should be present");
			System.out.println("According to Cust req : The data should be present");
			Thread.sleep(2000);
			usernameTextfield.clear();
			Thread.sleep(2000);
			usernameTextfield.sendKeys("Admin");
			Thread.sleep(2000);
			
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
