package topic_14_Module3_HandleUntrustedCerificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleUntrustedCertificates_ChromeBrowser {
	WebDriver driver;
	
	@Test(enabled=true, description="Chrome")
	public void handleUntrustedCerificatesChromeBrowser(){
		
		DesiredCapabilities cap=DesiredCapabilities.chrome(); 
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		// Set the driver path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 
		// Open browser with capability
		WebDriver driver=new ChromeDriver(cap);
		
		driver.get("https://cacert.org/");
	}

	
}
