package topic_13_Module3_ProfileSetting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfileSetting {

	@Test
	public void profileSetting(){
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		 // Create object of ProfilesIni class
		 
        ProfilesIni init=new ProfilesIni();

        // Get the default session  

        FirefoxProfile profile=init.getProfile("default");
        
        FirefoxOptions options = new FirefoxOptions();
        
        options.setProfile(profile);

       // Pass the session/profile to FirefoxDriver 

        WebDriver driver=new FirefoxDriver(options);



        driver.get("http://learn-automation.com/");



        driver.quit();

		
		
	}
		 
	}

