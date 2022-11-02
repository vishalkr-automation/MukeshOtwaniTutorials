package Module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IEBrowser {
	
	@Test
	public void f(){
		
		System.setProperty("webdriver.ie.driver","D:\\AutomationSoftwares\\BrowserDriver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com");
		
	}

}
