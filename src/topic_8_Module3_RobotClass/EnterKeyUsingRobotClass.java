package topic_8_Module3_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterKeyUsingRobotClass {

	WebDriver driver;
	@Test
	public void f() throws AWTException{
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user1");
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("user1");
	
	// Create object of Robot class
	Robot r=new Robot();
	 // Press Enter
	   r.keyPress(KeyEvent.VK_ENTER);
      // Release Enter
	   r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
