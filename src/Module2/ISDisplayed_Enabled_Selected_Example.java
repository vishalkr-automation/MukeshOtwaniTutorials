package Module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ISDisplayed_Enabled_Selected_Example {

	WebDriver driver;

	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationSoftwares\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement male_radio_button = driver.findElement(By.id("u_0_a"));

		boolean status = male_radio_button.isDisplayed();

		System.out.println("Male radio button is Displayed >>" + status);

		boolean enabled_status = male_radio_button.isEnabled();

		System.out.println("Male radio button is Enabled >>" + enabled_status);

		boolean selected_status = male_radio_button.isSelected();

		System.out.println("Male radio button is Selected >>" + selected_status);

		male_radio_button.click();

		boolean selected_status_new = male_radio_button.isSelected();

		System.out.println("Male radio button is Selected >>" + selected_status_new);
	}
	
}
