package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExceptionsInSeleniumWebDriver {
    WebDriver driver;
	
    @BeforeMethod
	public void beforeMethod(){
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/");
	}
    
    @Test
    public void f(){
     	
    	driver.findElement(By.id("[//input[@id='invalidid']")).sendKeys("Mukesh");
    }
}
