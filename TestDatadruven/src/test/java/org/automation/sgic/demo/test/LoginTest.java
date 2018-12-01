package org.automation.sgic.demo.test;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginTest  extends BeseTest{
	private static Logger logger = LogManager.getLogger(LoginTest.class);

	  boolean flag = false;
	  @Test
	public void testOrangeHRM() {
		DataXl.readExcelFile(excelFilePath);
		DataXl.loadData();
		
		  for (int i = 0; i < DataXl.testData.get("username").size(); i++) {
		      try {
		        extentTest = extentReport.startTest("Admin Login");
		        driver.get(prop.getProperty("baseUrl"));
		     //   Log.startTestCase();
		        driver.findElement(By.xpath(
		            "(.//*[normalize-space(text()) and normalize-space(.)='LOGIN Panel'])[1]/following::span[1]"))
		            .click();
		        driver.findElement(By.id("txtUsername")).clear();
		        driver.findElement(By.id("txtUsername"))
		            .sendKeys(DataXl.testData.get("username").get(i));
		        extentTest.log(LogStatus.PASS, "Entered username");
		        logger.log(Level.INFO, "********* Entered username **********");
		        driver.findElement(By.id("txtPassword")).clear();
		        driver.findElement(By.id("txtPassword"))
		            .sendKeys(DataXl.testData.get("password").get(i));
		        extentTest.log(LogStatus.PASS, "Entered password");
		        logger.log(Level.INFO, "********* Entered password **********");
		        driver.findElement(By.id("btnLogin")).click();
		        extentTest.log(LogStatus.PASS, "Login button clicked");
		        logger.log(Level.INFO, "********* Login button clicked **********");
		        Thread.sleep(500);
		        driver.findElement(By.id("welcome")).click();
		        Thread.sleep(500);
		        try {
		          assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Admin");
		          logger.log(Level.INFO, "Verified Welcome Message");
		        } catch (Error e) {
		         // String file = captureScreeShot();
		          extentTest.log(LogStatus.FAIL, "Failed to find the message");
		         // logger.log(Level.ERROR, "Failed to find mesasge. \n" + "Screenshot file: " + file);
		        }

		        driver.findElement(By.linkText("Logout")).click();
		       // Log.endTestCase();
		       // extentReport.endTest(extentTest);
		      } catch (Exception e) {
		        // TODO: handle exception
		      }
		    }
	}

}
