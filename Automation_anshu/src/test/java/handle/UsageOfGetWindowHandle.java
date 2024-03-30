package handle;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetWindowHandle {
public static  void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/signup/");
	String wid = driver.getWindowHandle();
	System.out.println(wid);
	driver.findElement(By.name("firstname")).sendKeys("Anshu");
	driver.findElement(By.name("lastname")).sendKeys("singh");
	driver.findElement(By.name("reg_email__")).sendKeys("anshukumarsingh786@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("anshu123");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anshukumarsingh786@gmail.com");
	
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
     Select daySelect = new Select(day);
     daySelect.selectByIndex(2);
     
     Select dayMonth = new Select(month);
     dayMonth.selectByVisibleText("Nov");
    
     Select dayYear = new Select(year);
     dayYear.selectByValue("1995");
    
     driver.findElement(By.xpath("//input[@value='2']")).click();
    
    
     Thread.sleep(4000);
    
     driver.findElement(By.name("websubmit")).click();
    
     //driver.close();
   
    
   
}
}
