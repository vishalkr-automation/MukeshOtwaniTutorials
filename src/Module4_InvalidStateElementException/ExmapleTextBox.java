package Module4_InvalidStateElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExmapleTextBox {
	
	WebDriver driver;
	
	@Test
	public void f(){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		// This element is disable, so if we try to click on disable webelement then it will throw exception
				// Using below code it will pass the data forcefully.
		 
				JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
				jse.executeScript("document.getElementById('pass').value = 'mukeshotwani';");
				
		
		
	}

}
