package topic_7_Module3_screenShotsExample;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	public static void captureScreenShot(WebDriver driver){
		 // Take screenshot and store as a file format
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("./ScreenShotFolder/"+System.currentTimeMillis()+".png"));
			} 
			catch (IOException e) 
			{
			System.out.println(e.getMessage());
			    } 
		}
	
	public static void captureScreenShot1(WebDriver driver){
		 // Take screenshot and store as a file format
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss a");  
		String strDate= formatter.format(date);  
		System.out.println(strDate);  
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("./ScreenShotFolder/"+strDate+"_"+".png"));
		
			} 
			catch (IOException e) 
			{
			System.out.println(e.getMessage());
			    } 
		}
	
	public static void captureScreenShot3(WebDriver driver, String ScreenShotName){
		 // Take screenshot and store as a file format
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("./ScreenShotFolder/"+ScreenShotName+".png"));
			} 
			catch (IOException e) 
			{
			System.out.println(e.getMessage());
			    } 
		}
}

