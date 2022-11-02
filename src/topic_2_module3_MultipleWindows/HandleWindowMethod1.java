package topic_2_module3_MultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowMethod1 {
   WebDriver driver;
	@Test
	public void f(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@class='post-body entry-content']//a[1]")).click();
		
		System.out.println("Parent Window ID is: "+ parentwindow);
		
		Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("Total Windows are:"+ count);
		
		for(String child:allwindows){
			if(!child.equalsIgnoreCase(parentwindow)){
				driver.switchTo().window(child);
				System.out.println("Title of Child window is: "+ driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		System.out.println("Title of parent window is: "+ driver.getTitle());
		
		
	}
}
