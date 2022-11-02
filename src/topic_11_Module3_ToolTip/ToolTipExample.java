package topic_11_Module3_ToolTip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipExample {

	 WebDriver driver;
		@Test
		public void faceBookLoginFailureExample(){
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='lastname']")).click();
			driver.findElement(By.xpath("//input[@name='firstname']//ancestor::div[1]//following::i[1]")).click();
			Actions a=new Actions(driver);
			
			WebElement toolTip=driver.findElement(By.xpath("//div[contains(@class,'uiContextualLayerLeft')]/div[1]/div[1]"));
			a.moveToElement(toolTip).perform();
			
			System.out.println("Tool Tip Message: "+ toolTip.getText());
		}
		
}
