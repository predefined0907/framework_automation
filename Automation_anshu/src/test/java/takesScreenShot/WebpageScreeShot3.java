package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageScreeShot3 {
	public static void main(String[] args) throws IOException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.the-maharajas.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
	    File permfile = new File("./errorshot/maharajapage.png");
	    FileUtils.copyFile(tempfile, permfile);
}
}