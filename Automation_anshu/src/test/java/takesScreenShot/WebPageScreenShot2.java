package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShot2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempWebPage = ts.getScreenshotAs(OutputType.FILE);
	File permWebPage = new File("./errorshots/"+timeStamp+"facebookpage.png");
	FileUtils.copyFile(tempWebPage, permWebPage);	
}
}
