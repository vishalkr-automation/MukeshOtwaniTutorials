package topic_5_Module3_HandleBootstrapPopupWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleModelWindow {

	 WebDriver driver;
	
 @BeforeMethod
	public void beforeMethod(){
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://seleniumpractise.blogspot.in/2016/11/handle-bootstrap-model-dialog-in.html");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	 
	 @Test(enabled=true)
		public void f1() throws Exception{	
			driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();
			
			driver.findElement(By.xpath("//div[@class='modal-body']//input[1]")).sendKeys("learn1@gmail.com");
			
			
		}
}
