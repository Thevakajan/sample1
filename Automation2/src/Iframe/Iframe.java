package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {

	@Test
	public void FrameTest() {
		System.setProperty("webdriver.chrome.driver","D:/Selanium/chromedriver_win32_3/chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.findElement(By.id("alert")).click();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("firstname")).sendKeys("Theva");
		driver.findElement(By.name("lastname")).sendKeys("Theva");
		//driver.findElement(By.cssSelector(".share-link-description")).sendKeys("Male");
       driver.switchTo().defaultContent();
	}

}
