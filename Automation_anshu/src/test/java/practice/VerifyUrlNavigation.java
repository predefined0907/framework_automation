package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyUrlNavigation {

	public static void main(String[] args) throws InterruptedException {
		

		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.youtube.com/");
				String expectedurl ="https://www.youtube.com/";
				String actualurl=driver.getCurrentUrl();
				if(actualurl.equals(expectedurl))
				{
					System.out.println("url is succesfully navigating and pass");
				}
				else
				{
					System.out.println("url is not succesfully navigating and fail");
				}
				
				//driver.findElement(By.xpath("//yt-formatted-string[text()='Ram Siya Ram (Hindi) Adipurush | Prabhas | Sachet-Parampara, Manoj Muntashir S | Om Raut | Bhushan K']")).click();
				Thread.sleep(3000);
                //driver.navigate().back();
                driver.findElement(By.xpath("//yt-formatted-string[text()='Akshay की Fitness Trainer ने दिया Kapil को ट्रेनिंग | The Kapil Sharma Show | दी कपिल शर्मा शो']")).click();
				}

}
