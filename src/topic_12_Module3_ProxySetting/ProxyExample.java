package topic_12_Module3_ProxySetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ThreadGuard;

public class ProxyExample {
	
	WebDriver driver;
	
	//Open and Initialize Firefox Driver
			public  void initalizeFirefoxDriver() {
				System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
				FirefoxOptions options = new FirefoxOptions();
				Proxy p = new Proxy();
				p.setProxyType(ProxyType.MANUAL);
				p.setHttpProxy("localhost:8080");
				p.setSslProxy("localhost:8080");
				options.setProxy(p);
				driver = new FirefoxDriver(options);
				
			}
			//Open and Initialize Chrome Driver
			public  void initalizeChromeDriver() {
				System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				Proxy p = new Proxy();
				p.setHttpProxy("localhost:8080");
				p.setSslProxy("localhost:8080");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.setProxy(p);
				driver = new ChromeDriver(options);
			
			}

}
