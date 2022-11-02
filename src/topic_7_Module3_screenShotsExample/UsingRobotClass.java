package topic_7_Module3_screenShotsExample;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

public class UsingRobotClass {

	@Test
    public void f() throws Exception{
		// This code will capture screenshot of current screen		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			    
		// This will store screenshot on Specific location
		ImageIO.write(image, "png", new File(".\\ScreenShotFolder\\CurrentScreenshot.png")); 
	}
}
