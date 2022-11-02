package module2_WaitCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CustomWait {
	
	@Test
	public void f() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		isElementPresnt(driver,".//*[@id='txtSource']", 3).sendKeys("Bangalore");
	}
	
	
	public static WebElement isElementPresnt(WebDriver driver, String xpath, int time) throws Exception {
		WebElement ele = null;

		for (int i = 0; i <= time; i++) {
			try {
				ele = driver.findElement(By.xpath(xpath));
				break;
			} catch (Exception e) {
				if(i==time){
					//throw e;
					System.out.println(e.getMessage());
					
				}
				else{
					Thread.sleep(1000);
					System.out.println("Waiting for element to appear on DOM");
					
				}	
				
			}

		}
		return ele;

	}

}
