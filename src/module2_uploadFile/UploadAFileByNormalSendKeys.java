package module2_uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadAFileByNormalSendKeys {

	WebDriver driver;
	
	@Test(priority=2, enabled=true)
	public void f2() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationSoftwares\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		   driver.get("http://my.monsterindia.com/create_account.html");
			Thread.sleep(5000);
			
			// This will scroll down the page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,350)");
			
			// Wait for 5 seconds
			Thread.sleep(5000);
			
			//upload a file
			driver.findElement(By.id("wordresume")).sendKeys("C:\\Users\\vishalkumar\\Desktop\\1.docx");
				
		
	}

}
