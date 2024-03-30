package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShot02 {
public static void main(String[] args) throws IOException, Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://demo.actitime.com/login.do");
	WebElement actiTImeLogo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	File tempFile = actiTImeLogo.getScreenshotAs(OutputType.FILE);
	//String systemPath = tempFile.getAbsolutePath();
	//System.out.println(systemPath);
	File permFile = new File("./errorshots/"+timeStamp+"actiTImeLogo.jpg");
	FileUtils.copyFile(tempFile, permFile);
	//Thread.sleep(20000);
}
}
