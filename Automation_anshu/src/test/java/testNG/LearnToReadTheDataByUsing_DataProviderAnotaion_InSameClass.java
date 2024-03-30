package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnToReadTheDataByUsing_DataProviderAnotaion_InSameClass {
	WebDriver driver;
@Test(dataProvider = "dataprovidermethod")
public void myFirstDataReadingInSameClass(String firstname,String lastname,String phno,String email) throws Throwable {
	System.out.println(firstname + lastname + phno + email);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	WebElement firstnameTextField = driver.findElement(By.name("firstname"));
	firstnameTextField.sendKeys(firstname);
	WebElement lastnameTextField = driver.findElement(By.name("lastname"));
	lastnameTextField.sendKeys(lastname);
	Thread.sleep(1000);
	driver.manage().window().minimize();
	driver.quit();
}
@DataProvider
public Object[][] dataprovidermethod(){
	Object[][] obj = new Object[2][4];
	obj[0][0] = "anshu";
	obj[0][1] = "singh";
	obj[0][2] = "8709674863";
	obj[0][3] = "anshu@gmail.com";
	
	obj[1][0] = "Tom";
	obj[1][1]= "cruise";
	obj[1][2] = "9876543210";
	obj[1][3] = "tom@gmail.com";
	
	return obj;
	
}
}
