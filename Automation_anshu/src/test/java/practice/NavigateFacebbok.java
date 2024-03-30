package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFacebbok {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//driver.get("https://www.facebook.com/?stype=lo&jlou=AfcfWCGd8lPKIRJQTjkcl6By4an-Rj_aYClZ5lDESz_12608-aeMz4a3Gus92XbxRfF7KSUAjR_-Srd-8vzKWgBNvMeCWkszUzOt-sZYhs-aHg&smuh=65456&lh=Ac90pLJF9sLNPV2stRM");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.findElement(By.xpath("//a[@class='_97w4']")).click();
	
	}
}