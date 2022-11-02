package topic_3_Module3_iFrameExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameExample1 {
    WebDriver driver;
	@Test
	public void f1() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Worspace2/MukeshOtwaniTutorials/src/Module3_iFrameExamples/MyFramesExample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame("hms");
		driver.findElement(By.name("username")).sendKeys("tester1");
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("parentPageLink")).click();
		
		
	}
}
