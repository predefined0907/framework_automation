package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger {

	public static <select> void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.xpath("//*[name()='svg'][@class='icon icon-search font-weight-bold h3']")).click();
		driver.findElement(By.xpath("//input[@class='searchsub form-control border-0 px-1 py-7']")).sendKeys("products");
		driver.findElement(By.xpath("//*[local-name()='svg'][@class='icon icon-search']")).click();
		//select objSelect =new Select(driver.findElement(By.xpath("//a[@id='navbarPages']")));
		//((Object) objSelect).selectByVisibleText("sales");
	}

}



