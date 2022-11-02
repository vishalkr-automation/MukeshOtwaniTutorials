package module2_uploadFile;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UploadFileUsingRobotClass {
	WebDriver driver;
	

	@Test(priority=1, enabled=true)
	public void f() throws AWTException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Users\\visha\\OneDrive\\Desktop\\sample.docx");

		//copy to clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("Selection: "+ sel);
		
		driver.get("https://www.monsterindia.com/seeker/registration?");
		Thread.sleep(5000);
		
		// This will scroll down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		
		// Wait for 5 seconds
		Thread.sleep(5000);

		// This will click on Browse button
		driver.findElement(By.xpath("//span[text()='Choose CV']")).click();
		
		System.out.println("Browse button clicked");

		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
	//Press Enter�
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	

}
