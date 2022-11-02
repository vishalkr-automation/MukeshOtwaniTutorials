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

public class DatePickerDemo3 {

	WebDriver driver;
	
	 @BeforeMethod
		public void beforeMethod(){
			 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.spicejet.com/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	 @Test
	 public void f() throws Exception{
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
			Thread.sleep(2000);
			outer:
			for(;;){
			List<WebElement> yearList=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//span[contains(@class,'ui-datepicker-year')]"));
			List<WebElement> MonthList=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//span[contains(@class,'ui-datepicker-month')]"));
			
			
			for(WebElement year:yearList){
				String YearValue=year.getText();
				System.out.println(YearValue);
				
				for(WebElement month:MonthList){
					String MonthValue=month.getText();
					System.out.println(MonthValue);
					
					if(YearValue.equalsIgnoreCase("2019") && MonthValue.equalsIgnoreCase("August")){
						System.out.println("Month & Year: "+ MonthValue+""+YearValue);
						
						List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-group-first')]//table//td"));
						int totalDates=dates.size();
						
						dateLoop:
						for(int i=0; i<=totalDates; i++){
						String date=dates.get(i).getText();
						System.out.println(date);
					    if(date.equalsIgnoreCase("18")){  //It will check whether date is available or not
						if(dates.get(i).getAttribute("class").contains("ui-state-disabled")){ //It will check if date is available then it is clickable or not
						Assert.fail("Invalid Date is selected");			
						}
						else{
							dates.get(i).click();
							System.out.println("Break inner loop"); //Once Date Will be satisfied then Next Button will be not clicked 
							 break dateLoop;

						}
							}
						}
						System.out.println("Break Outer Loop"); //Once Year and Month Will be satisfied then Next Button will be not clicked 
						break outer; 
						
					}
					
				}
			}
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//span[text()='Next']")).click(); //Click on Next Button from Calendar
			}
	 }
}
