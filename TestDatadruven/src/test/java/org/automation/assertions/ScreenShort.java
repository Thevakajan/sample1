package org.automation.assertions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShort {
	public static void captureScreenshot(WebDriver driver,String screenshotName) {
		 try {
				TakesScreenshot  ts=(TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("C:\\ec\\Eample\\TestDatadruven\\screen\\"+screenshotName+".png"));
			} catch (Exception e1) {
				
				System.out.println("ScreenShot"+e1.getMessage());
			}
		   
	}

}
