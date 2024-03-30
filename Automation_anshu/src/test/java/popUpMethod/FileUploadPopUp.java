package popUpMethod;

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
	
	WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
	fileUpload.sendKeys("C:\\Users\\Anshu\\Desktop\\git.txt");
	
	WebElement aTC = driver.findElement(By.id("terms"));
	aTC.click();
	WebElement submitOption = driver.findElement(By.id("submitbutton"));
	submitOption.click();
}
}
