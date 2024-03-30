package locators;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class CssSelector {

	public static <select> void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		WebElement fistnameselect = driver.findElement(By.cssSelector("input[name=\"firstname\"]"));
		fistnameselect.sendKeys("Anshu");
		
		WebElement surnameinput = driver.findElement(By.cssSelector("input[aria-label='Surname']"));
		surnameinput.sendKeys("Singh");
		
		WebElement emailinput = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailinput.sendKeys("Anshusingh@gmail.com");
		
		WebElement reEnterEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		reEnterEmail.sendKeys("Anshusingh@gmail.com");
		
		WebElement passwordinput = driver.findElement(By.cssSelector("input[id='password_step_input']"));
		passwordinput.sendKeys("Anshu$#@123");
		
		WebElement daySelect = driver.findElement(By.cssSelector("select[name='birthday_day']"));
		WebElement month = driver.findElement(By.cssSelector("select[aria-label='Month']"));
		WebElement year = driver.findElement(By.cssSelector("select[title='Year']"));
		
		
		Select days = new Select(daySelect);
	    days.selectByIndex(4);
	    
	    Select monthselect = new Select(month);
	    monthselect.selectByValue("11");
	    
	    Select yearselect = new Select(year);
	    yearselect.selectByVisibleText("1995");
	    
	    Thread.sleep(2000);
	    
	    
	    WebElement sexSelect = driver.findElement(By.xpath("//input[@value='2']"));
	    sexSelect.click();
	    
	    WebElement submitbutton = driver.findElement(By.cssSelector("button[name='websubmit']"));
	    submitbutton.click();
				
	}

}
