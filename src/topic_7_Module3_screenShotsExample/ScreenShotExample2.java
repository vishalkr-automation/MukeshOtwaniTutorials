package topic_7_Module3_screenShotsExample;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotExample2 {
	
	WebDriver driver;
	@Test(enabled=false)
	public void f() throws Exception{
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Utils.captureScreenShot(driver);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Utils.captureScreenShot(driver);
		
		
	}
	
	@Test(enabled=true)
	public void f1() throws Exception{
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Utils.captureScreenShot1(driver);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Utils.captureScreenShot1(driver);
		
		
	}
}
