package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUnselected {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("file:///C:/Users/Anshu/AppData/Local/Microsoft/Windows/INetCache/IE/PI6E9O61/breakfast[2].html");
	
	WebElement Ele = driver.findElement(By.id("cp"));
	
	Select selectDrop = new Select(Ele);
	List<WebElement> allOption = selectDrop.getOptions();
    for (WebElement all : allOption) {
    	if(all.isSelected()==true) {
    		System.out.println(all.getText());
		
	}
	}
	
	
	
}
}
