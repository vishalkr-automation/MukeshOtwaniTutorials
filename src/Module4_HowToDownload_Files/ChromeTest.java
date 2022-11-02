package Module4_HowToDownload_Files;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeTest {
	//WebDriver driver;
	
	@Test
	public void f() throws Exception{
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		/*ProfilesIni profile2 = new ProfilesIni();
        FirefoxProfile profile3 = profile2.getProfile("default");
        profile3.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setProfile(profile3);*/
		
		//ProfilesIni profile = new ProfilesIni();
		FirefoxProfile testprofile = new FirefoxProfile();
		testprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, testprofile);
		FirefoxOptions opt = new FirefoxOptions();
		opt.merge(dc);

        WebDriver driver = new FirefoxDriver(opt);
		//Maximize browser window
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[text()='Selenium Standalone Server']//following-sibling::p[2]/a")).click();

}
}