package Module4_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToClickOnElement {

	WebDriver driver;
	
	@Test
	public void f(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// This element is disable, so if we try to click on disable webelement
		// then it will throw exception Using below code it will pass the data forcefully.

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("document.getElementById('u_0_a').click();");
	}
}
