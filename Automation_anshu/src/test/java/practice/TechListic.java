package practice;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class TechListic {

	public static <select> void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Anshu");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Singh");
		
		WebElement gender = driver.findElement(By.id("sex-0"));
		gender.click();
		
		WebElement exp = driver.findElement(By.id("exp-2"));
		exp.click();
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("10/12/2023");
		Thread.sleep(2000);
		WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession.click();
		
		WebElement AutomationTool = driver.findElement(By.id("tool-2"));
		AutomationTool.click();
		
		WebElement continents = driver.findElement(By.name("continents"));
		
		Select ContinenetsSelect = new Select(continents);
	    ContinenetsSelect.selectByIndex(0);
	     
	    WebElement SleniumComandsSelect = driver.findElement(By.id("selenium_commands")); 
	     
	    Select  SleniumComands = new Select(SleniumComandsSelect);
	    SleniumComands.selectByIndex(1);
	    Thread.sleep(2000);
	    
	    WebElement inputSelect = driver.findElement(By.xpath("//input[@id='photo']"));
	    inputSelect.click();
	    
		// Thread.sleep(4000);
		
		driver.close();
	}

}
