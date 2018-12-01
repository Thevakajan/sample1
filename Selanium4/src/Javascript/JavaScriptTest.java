package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\New folder\\\\\\\\chromedriver_win32_3\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com"); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("logo")).click();
		js.executeScript("!$('button ajax_add_to_cart_button btn btn-default').click()" );

	}

}
