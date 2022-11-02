package topic_15_Module3_PageScrollExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollExample1 {
	WebDriver driver;

	@Test
	public void scrollDownAndUP() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://learn-automation.com/scroll-page-in-selenium-webdriver/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		// This  will scroll page 1000 pixel vertical
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,-1000)");
		
		
		
		
	}
}
