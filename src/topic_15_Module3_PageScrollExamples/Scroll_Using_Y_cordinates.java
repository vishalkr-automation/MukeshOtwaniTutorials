package topic_15_Module3_PageScrollExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Scroll_Using_Y_cordinates {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
	 // Thread.sleep(3000);
	  
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	  WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/p[11]/button")));
  Point p = ele.getLocation();
  int y = p.getY();

	  ((JavascriptExecutor)driver).executeScript("window.scroll(0,"+y+")");
	  
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click()",ele);
	  
	  Alert alert=driver.switchTo().alert();
	  String str=alert.getText();
	  System.out.println("Alert text is: "+ str);
	  alert.sendKeys("Accepting the alert");
	  Thread.sleep(2000);
	  alert.accept();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
