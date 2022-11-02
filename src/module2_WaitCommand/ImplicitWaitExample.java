package module2_WaitCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicitWaitExample {

	@Test
	public void verifySeleniumTitle()

	{
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://www.learn-automation.com");

		// Specify implicit wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// No login id is present on Webpage so this will fail our script.
		driver.findElement(By.id("login")).sendKeys(" Selenium Webdriver");

	}
}
