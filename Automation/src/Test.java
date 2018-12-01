import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selanium\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver .get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.id("email")).sendKeys("dharmakrish6@gmail.com");
        driver.findElement(By.name("passwd")).clear();
        driver.findElement(By.name("passwd")).sendKeys("12345");
        driver.findElement(By.id("SubmitLogin")).click();
        System.out.println("Suecessfull Login");
	}

}
