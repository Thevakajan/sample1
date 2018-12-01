package TestCash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Application {
	@Test
	public void FrameTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\New folder\\\\\\\\chromedriver_win32_3\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");//
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("firstname")).sendKeys("Theva");
		driver.switchTo().defaultContent();
	} 

}
