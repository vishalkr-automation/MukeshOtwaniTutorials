package Module4_HighlightOnElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighLightTextBox {
	// Element highlighter code
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// For HighLight Yellow Color
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

       //For Hight White Color
		//js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}
	
	@Test
	public void f(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// Inspect element
		WebElement username = driver.findElement(By.id("email"));
		// Call reuse method
		highLightElement(driver, username);
		
	}

}
