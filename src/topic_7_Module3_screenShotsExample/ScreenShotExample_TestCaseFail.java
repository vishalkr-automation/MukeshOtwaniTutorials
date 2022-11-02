package topic_7_Module3_screenShotsExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShotExample_TestCaseFail {
    WebDriver driver;
	@Test
	public void faceBookLoginFailureExample(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='emaillllllllll']")).sendKeys("user1");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			Utils.captureScreenShot3(driver, result.getName());
		}
	}
}
