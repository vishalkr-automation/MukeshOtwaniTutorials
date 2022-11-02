package module2_WaitCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitExample {
	WebDriver driver;
	@Test
	public void f(){
		// Start browser
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
		// Start application
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
 
		// Click on timer button to start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		String str=fluentWait("//p[text()='WebDriver']").getText();
		System.out.println(str);
		
		/*// Create object of WebDriverWait class and it will wait max of 20 seconds.
				// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);
 
		// Here we will wait until element is not visible, if element is visible then it will return web element
		// or else it will throw exception
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
 
		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();
 
		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}*/
	}

	
	
	public WebElement fluentWait(final String str){
    	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
    	wait.withTimeout(80, TimeUnit.SECONDS)
    	.pollingEvery(5, TimeUnit.SECONDS)
    	.ignoring(NoSuchElementException.class);
    	
    	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
    		 
    	     public WebElement apply(WebDriver driver) {
    	 WebElement e1=driver.findElement(By.xpath(str));
    	       return e1;
    	 
    	     }
    	 
    	   });
    	return foo;
    }
}
