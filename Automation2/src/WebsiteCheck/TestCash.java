package WebsiteCheck;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TestCash {
	public  void FoodTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selanium\\chromedriver_win32_3\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("theva");
		driver.findElement(By.name("lastname")).sendKeys("Kajan");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("datepicker")).sendKeys("20");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.id("continents")).sendKeys("Australia");
		driver.findElement(By.id("submit")).click();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }

	}

}
