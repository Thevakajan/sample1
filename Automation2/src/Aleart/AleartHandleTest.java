package Aleart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AleartHandleTest {
	@Test
      public void aleartTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:/Selanium/chromedriver_win32_3/chromedriver.exe ");
	
	WebDriver driver = new ChromeDriver();
	
	//driver.findElement(By.id("alert")).click();
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("alert")).click();
	Alert myalert=driver.switchTo().alert();

	Thread.sleep(5000);
	myalert.accept();
      }
}
 