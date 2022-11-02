package topic_6_Module3_DatePicker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataPickerDemo2 {

	WebDriver driver;
	
	 @BeforeMethod
		public void beforeMethod(){
			 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.redbus.in/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		 
	//This function for select Year , Month and date for only a single calendar
	 @Test
	 public void f() throws Exception{
		 driver.findElement(By.xpath("//div[@id='search_div']//div[contains(@class,'gtm-onwardCalendar')]/span")).click();
			Thread.sleep(2000);
			outer:
			for(;;){
			WebElement yearlist=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']"));
			
				String year=yearlist.getText();
				System.out.println(year);
				if(year.equalsIgnoreCase("July 2019")){
					System.out.println("Year and Month: "+ year);
					List<WebElement> dayList=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
					inner:
					for(WebElement day:dayList){
						String days=day.getText();
						System.out.println("days are: "+days);
						if(days.equalsIgnoreCase("16")){
							
							String pastDays=day.getAttribute("class");
							if(pastDays.equalsIgnoreCase("past day")){
								Assert.fail("Back Dated Test Date data Entered");
							}
							else{
								day.click();
								System.out.println("Break inner loop"); //Once Date Will be satisfied then Next Button will be not clicked 
								break inner;
							}
						}
					}
					System.out.println("Break Outer Loop"); //Once Year and Month Will be satisfied then Next Button will be not clicked 
					break outer;
					
				}
				
				else{
					//Click on Next Button from Calendar
					driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='next']/button")).click(); 
				}
				
			}	
	 }

	 }