package topic_14_Module3_HandleUntrustedCerificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleUntrustedCertificates_InternetExplorer {
	WebDriver driver;
	
	@Test(enabled=true, description="IE")
	public void handleUntrustedCerificatesChromeBrowser(){
		
		// Create object of DesiredCapabilities class 
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		 
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 
		
		System.setProperty("webdriver.ie.driver","IE driver path");
		 
		// Open browser with capability
		WebDriver driver=new InternetExplorerDriver(cap);
		
		driver.get("https://cacert.org/");
	}

	
}
