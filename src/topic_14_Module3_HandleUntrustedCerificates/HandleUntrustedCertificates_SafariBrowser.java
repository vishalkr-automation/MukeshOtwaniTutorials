package topic_14_Module3_HandleUntrustedCerificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class HandleUntrustedCertificates_SafariBrowser {
	WebDriver driver;
	
	@Test(enabled=true, description="Safari")
	public void handleUntrustedCerificatesChromeBrowser(){
	  
		// Create object of DesiredCapabilities class

		DesiredCapabilities cap=DesiredCapabilities.safari();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Set the driver path
		System.setProperty("webdriver.safari.driver","Safari driver path");
		 
		// Open browser with capability
		WebDriver driver=new SafariDriver(cap);
		
		driver.get("https://cacert.org/");
	}

	
}
