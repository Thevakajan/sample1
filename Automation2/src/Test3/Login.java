package Test3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login {
	@Test
	public void loginTest(){  
		System.setProperty("webdriver.chrome.driver","D:/Selanium/chromedriver_win32_3/chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		///String at = driver.getTitle();
		//driver.findElement(By.cssSelector(".login")).click();
//		driver.findElement(By.id("email")).clear();
//		///cssselector-/#login_form>div>div:first-child .account_input 
//		driver.findElement(By.id("email")).sendKeys("dharmakrish6@gmail.com");
//		driver.findElement(By.name("passwd")).clear();
//		driver.findElement(By.name("passwd")).sendKeys("12345");
//		driver.findElement(By.id("SubmitLogin")).click();  
		driver.findElement(By.cssSelector(".sf-with-ul")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("$('.product_list>li:first-child .ajax_add_to_cart_button').click()");
		
		System.out.println("Create Successfull");
		//driver.findElement(By.cssSelector("#login_form .submit .button-medium")).click();
		
	}
}
