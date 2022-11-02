package topic_15_Module3_PageScrollExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollIntoViewElement {
	WebDriver driver;
	
	
	public void beforeMethod(String url){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//By Xapth
	@Test(enabled=false)
	public void f(){
		beforeMethod("https://www.toolsqa.com/");
	    WebElement e1=driver.findElement(By.xpath("//a//img[@alt='Appium StudioTutorial']"));
	    ((JavascriptExecutor) driver).executeScript("return arguments[0].scrollIntoView(true);", e1);
	}
	
	//BY ID
	@Test(enabled=true)
	public void f1(){
		beforeMethod("https://www.toolsqa.com/automation-practice-form/");
	    ((JavascriptExecutor) driver).executeScript("return document.getElementById('submit').scrollIntoView(true);");
	}

	
}
