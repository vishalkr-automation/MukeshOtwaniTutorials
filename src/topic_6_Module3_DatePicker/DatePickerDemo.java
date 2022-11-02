package topic_6_Module3_DatePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerDemo {

	WebDriver driver;
	
	 @BeforeMethod
		public void beforeMethod(){
			 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.spicejet.com/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		 
	 //This function for select only date for only a single calendar
		 @Test(enabled=true)
			public void f1() throws Exception{	
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
				Thread.sleep(2000);
				List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-group-first')]//table//td"));
				
				int totalDates=dates.size();
				
				for(int i=0; i<=totalDates; i++){
				String date=dates.get(i).getText();
				System.out.println(date);
				
			if(date.equalsIgnoreCase("16")){  //It will check whether date is available or not
				if(dates.get(i).getAttribute("class").contains("ui-state-disabled")){ //It will check if date is available then it is clickable or not
				Assert.fail("Invalid Date is selected");			
				}
				else{
					dates.get(i).click();
					break;

				}
					}
				}
			}
}
