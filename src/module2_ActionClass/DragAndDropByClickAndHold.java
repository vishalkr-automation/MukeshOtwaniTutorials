package module2_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropByClickAndHold {
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	}
	
	@Test(enabled=true)
	public void f2() throws Exception{
		
		// Add 5 seconds wait
				Thread.sleep(5000);

				// Create object of actions class
				Actions actions=new Actions(driver);

				// find element which we need to drag
				WebElement source=driver.findElement(By.xpath(".//*[@id='draggable']"));
				
				WebElement destination=driver.findElement(By.xpath(".//*[@id='droppable']"));
				
				// it will click and hold the triller box and move to element will move cursor to history in another box and then release
				actions.clickAndHold(source).pause(2000).moveToElement(destination).release().build().perform();
	}
}
