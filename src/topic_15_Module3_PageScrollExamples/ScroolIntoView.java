package topic_15_Module3_PageScrollExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScroolIntoView {
	WebDriver driver;

	@Test
	public void scrollIntoViewExample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);

		// Create instance of Javascript executor

		JavascriptExecutor je = (JavascriptExecutor) driver;

		// Identify the WebElement which will appear after scrolling down

		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));

		// now execute query which actually will scroll until that element is
		// not appeared on page.

		je.executeScript("arguments[0].scrollIntoView(true);", element);

		// Extract the text and verify

		System.out.println(element.getText());
		
		
		
		
	}
}
