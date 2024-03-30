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

public class WebElementScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
    driver.get("https://www.facebook.com/");
    WebElement createNewAccountButton = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
    File tempFile1 = createNewAccountButton.getScreenshotAs(OutputType.FILE); 
    File permFile1 = new File("./errorshot/"+timeStamp+"createNewAccountButton.png");
    FileUtils.copyFile(tempFile1, permFile1);
    WebElement loginButton = driver.findElement(By.name("login"));
    File tempFile2 = loginButton.getScreenshotAs(OutputType.FILE);
    File permFile2 = new File("./errorshots/"+timeStamp+"loginButton.png");
    FileUtils.copyFile(tempFile2, permFile2);
 
}
}
