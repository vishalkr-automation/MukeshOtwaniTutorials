package topic_18_Module3_HandleHiddenElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleHiddenElementExample1 {
	WebDriver driver;
	
	@Test
	public void f(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> radio=driver.findElements(By.id("male"));
		int count=radio.size();
		System.out.println("Total Radio Buttons: "+ count);
		
		for(int i=0; i<count; i++){
			int x=radio.get(i).getLocation().getX();
			if(x != 0){
				radio.get(i).click();
				break;
			}
			
		}
			
		
		
	}

}
