package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/upload/");
	
	WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
	uploadFile.sendKeys("C:\\Users\\Anshu\\Desktop\\Maven repo.txt");
	
	WebElement termsAndCondition = driver.findElement(By.id("terms"));
	termsAndCondition.click();
	WebElement submitButton  = driver.findElement(By.id("submitbutton"));
	submitButton.click();
}
}
