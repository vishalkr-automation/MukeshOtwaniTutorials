package Module4_StaleElementRefrenceException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	
	WebDriver driver;

	@Test(enabled=true)
	public void f1(){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		for(int i=0;i<=3;i++)
		{
		 
		  try{
		 
			  driver.findElement(By.id("persistent")).click();
		 
		    break;
		 
		}
		 
		catch(Exception e)
		{
		 
		System.out.println(e.getMessage());
		 
		}
	}
	}
}
