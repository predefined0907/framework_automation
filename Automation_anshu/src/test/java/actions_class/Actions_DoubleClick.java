package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_DoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
    
    driver.switchTo().frame("iframeResult");
    WebElement field1 = driver.findElement(By.id("field1"));
    field1.clear();
    field1.sendKeys("Welcome to my world");
    
    WebElement copytextbutton = driver.findElement(By.xpath("//button[.='Copy Text']"));
    Actions action = new Actions(driver);
    action.doubleClick(copytextbutton).perform();
    
    WebElement text = driver.findElement(By.xpath("//p[.='A function is triggered when the button is double-clicked. The function copies the text from Field1 into Field2.']"));
    String textcopy = text.getText();
    System.out.println("textcopy;"+textcopy);
	}

}
