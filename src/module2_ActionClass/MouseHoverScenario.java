package module2_ActionClass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHoverScenario {

WebDriver driver;

String parentWindow;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		parentWindow=driver.getWindowHandle();
	}
	
	@Test(enabled=true)
	public void f2() throws Exception{
		
		Thread.sleep(5000);
		
		Set<String> wind=driver.getWindowHandles();
		for(String handles:wind){
			System.out.println(handles);
			driver.switchTo().window(handles);
			if(!parentWindow.equalsIgnoreCase(handles)){
				driver.close();
			}
		}
		
		//switch to parent window after close all child windows
		driver.switchTo().window(parentWindow);
		
		
		//driver.switchTo().window(s[1].toString()).close();
		Thread.sleep(2000);
		
		//driver.switchTo().window(s[2].toString()).close();
		
		WebElement e1=driver.findElement(By.xpath("//span[@id='block']"));
		e1.click();
		
		driver.findElement(By.xpath("//div[@id='qsbClick']")).click();
		// Type something on Skill textbox
		WebElement e2=driver.findElement(By.xpath("//div[@id='skill']//input[@name='qp']"));
		e2.sendKeys("Java");
		
		Thread.sleep(2000);
		
		// Create object on Actions class
		Actions builder=new Actions(driver);
		 
		// find the element which we want to Select from auto suggestion
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='sugDrp_skill']//ul//li/div"));
		
		for(WebElement listElmt:list){
			if(listElmt.getText().equalsIgnoreCase("Java")){
				builder.moveToElement(listElmt).build().perform();
				// Give wait for 2 seconds 
				Thread.sleep(2000);
				 
				// finally click on that element
				builder.click(listElmt).build().perform();
				break;
			}
		}
		// use Mouse hover action for that element
		
		 
		
	}
}
