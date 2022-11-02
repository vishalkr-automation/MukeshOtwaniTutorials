package topic_5_Module3_HandleBootstrapPopupWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleModelWindow2 {

	WebDriver driver;
	
	 @BeforeMethod
		public void beforeMethod(){
			 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.goibibo.com/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		 
		 @Test(enabled=true)
			public void f1() throws Exception{	
				driver.findElement(By.xpath("//a[text()='Sign up']")).click();
				
				driver.switchTo().frame("authiframe");
				
				driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("learn1@gmail.com");
				
				
			}
		 
}
