package topic_2_module3_MultipleWindows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows2 {

	WebDriver driver;
	
	@Test
	public void f(){
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Set<String> Allwindows=driver.getWindowHandles();
	
	ArrayList<String> listOfWindow=new ArrayList<>(Allwindows); 
	
	driver.switchTo().window(listOfWindow.get(2));
	driver.close();
	
	
	driver.switchTo().window(listOfWindow.get(1));
	driver.close();
	
	driver.switchTo().window(listOfWindow.get(0));
	System.out.println("Title of Parent Id is: "+driver.getTitle());
	
	
	}
}
