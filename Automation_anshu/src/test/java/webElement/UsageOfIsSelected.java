package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) throws Throwable {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
 // Thread.sleep(5000);
  WebElement Signupoption = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
  Signupoption.click();
  Thread.sleep(2000);
  WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
  if(maleRadioButton.isSelected())
  {
	  System.out.println("Method: TRUE");
	  System.out.println("Appln : FALSE maleRadioButton is should be in the selected format" );
  }
  else {
	  System.out.println("Method: FALSE");
	  System.out.println("Appln : TRUE maleRadioButton is should not be in the selected format" ); 
	  maleRadioButton.click();
  }
  driver.manage().window().minimize();
  driver.quit();
}
}
