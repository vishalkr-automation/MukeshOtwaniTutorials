package module2_uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadAFileUsingAutoIT {

	@Test
	public void f() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/vishalkumar/Desktop/fileuploader.html");
		driver.findElement(By.id("1")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\vishalkumar\\Desktop\\autoITScript\\FileUploader.exe");
		
	}
}
