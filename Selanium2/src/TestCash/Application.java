package TestCash;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import java.util.NoSuchElementException;

import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Application {
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
	 
	 
	@Test
	public void alertTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver_win32_3\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail&passive=1209600&sacu=1&ignoreShadow=0&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=AddSession/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Learn more'])[1]/following::span[1]")).click();
		driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("0777507231");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Too many failed attempts'])[1]/following::content[6]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Snoozed'])[1]/following::div[5]")).click();
	    
				
	}
	
	 @AfterMethod
	(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      Assert.fail(verificationErrorString);
	    }
	  }
	 private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
	 private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }


	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
