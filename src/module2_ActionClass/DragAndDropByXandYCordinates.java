package module2_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropByXandYCordinates {

WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	}
	
	@Test(enabled=true)
	public void f2() throws Exception{
		//driver.switchTo().frame(0);
		
		// Add 5 seconds wait
		Thread.sleep(5000);
 
		// Create object of actions class
		Actions act=new Actions(driver);
 
		// find element which we need to drag
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		// calling the method and x,y cordinates are random
		act.dragAndDropBy(drag, 250, 150).build().perform();
	}
	
}
