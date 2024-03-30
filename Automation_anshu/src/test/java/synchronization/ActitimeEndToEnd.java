package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class ActitimeEndToEnd {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement usernameTextField = driver.findElement(By.name("username"));
	usernameTextField.sendKeys("admin");
	
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("manager");
	
	WebElement loginOption = driver.findElement(By.xpath("//div[.='Login ']"));
	wait.until(ExpectedConditions.elementToBeClickable(loginOption));
	loginOption.click();
	
	wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
	WebElement userOption = driver.findElement(By.xpath("//div[@id='container_users']"));
	userOption.click();
	
	wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/administration/userlist.do"));
	WebElement newUserLink = driver.findElement(By.xpath("//div[.='New User']"));
	newUserLink.click();
	
	WebElement firstnameTextField = driver.findElement(By.name("firstName"));
	firstnameTextField.sendKeys("Anshu");
	
	WebElement lastnameTextField = driver.findElement(By.name("lastName"));
	lastnameTextField.sendKeys("Singh");
	
	WebElement emailTextFieled = driver.findElement(By.name("email"));
	emailTextFieled.sendKeys("anshusinghfire007@gmail.com");
	
	WebElement dropDown = driver.findElement(By.xpath("//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']/following::div[.='-- department not assigned --']"));
    Select department = new Select(dropDown);
    department.selectByVisibleText("-- new department --");
    
    WebElement newUserGroupNameTextField = driver.findElement(By.name("newUserGroupName"));
    newUserGroupNameTextField.sendKeys("medicine");
    
    WebElement SaveButton = driver.findElement(By.xpath("//div[.='Save & Send Invitation']"));
	wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
	SaveButton.click();
	
}
}
