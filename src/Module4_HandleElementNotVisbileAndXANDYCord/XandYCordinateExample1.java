package Module4_HandleElementNotVisbileAndXANDYCord;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XandYCordinateExample1 {
	
	WebDriver driver;

	@Test(enabled=false)
	public void f(){
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement e1 = driver.findElement(By.id("persistent"));
		//e1.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", e1);
		
		
	}
	
	@Test(enabled=false)
	public void f1(){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement e1 = driver.findElement(By.id("persistent"));
		//e1.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", e1);
		
		
	}
	
	@Test(enabled=true)
	public void f2(){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement e1 = driver.findElement(By.xpath("//label[@for='persistent']"));
		//e1.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", e1);
		
		
	}
}
