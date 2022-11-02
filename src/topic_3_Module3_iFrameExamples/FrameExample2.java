package topic_3_Module3_iFrameExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameExample2 {

	 WebDriver driver;
		@Test
		public void f1() throws Exception{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///D:/Worspace2/MukeshOtwaniTutorials/src/Module3_iFrameExamples/MyFramesExample.html");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
			int total_Frames=driver.findElements(By.tagName("iframe")).size();
			System.out.println("Total Frames in Application is: "+ total_Frames);
			
			WebElement my_frame=driver.findElement(By.cssSelector("iframe[name='Selenium News']"));
			
			driver.switchTo().frame(my_frame);
			
			driver.findElement(By.xpath("//a[text()='About']")).click();
			
			Thread.sleep(5000);
			
			driver.switchTo().defaultContent();
			driver.findElement(By.id("parentPageLink")).click();
			}
			catch(NoSuchFrameException e){
				System.out.println(e.getMessage());
			}
			
			
		}
}
