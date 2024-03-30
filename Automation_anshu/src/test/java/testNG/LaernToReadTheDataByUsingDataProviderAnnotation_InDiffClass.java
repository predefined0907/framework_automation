package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaernToReadTheDataByUsingDataProviderAnnotation_InDiffClass {
WebDriver driver;
@Test(dataProvider = "dataprovidermethod" ,dataProviderClass = LearnToReadTheDataByUsing_DataProviderAnotaion_InSameClass.class)
public void myFirstDataReadingFromDataProviderInDiffClass(String firstname , String lastname , String phno , String email) throws Throwable {
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
}
