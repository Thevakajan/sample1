import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selanium//chromedriver_win32_3//chromedriver.exe ");
         WebDriver driver = new ChromeDriver();
         driver.get("http://localhost/php/food-ordering-system-master/food-ordering-system-master/login.php");
         
//         driver.findElement(By.id("email")).clear();
//         driver.findElement(By.id("email")).sendKeys("");
//          driver.findElement(By.id("pass")).clear();
//         driver.findElement(By.id("pass")).sendKeys("");
//         driver.findElement(By.id("u_0_2")).click();
   
//         driver.findElement(By.name("firstname")).sendKeys("Theva");
//         driver.findElement(By.name("lastname")).sendKeys("Kajan");
//         driver.findElement(By.name("reg_email__")).sendKeys("Thevakajan3@gmail.com");
//         driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Thevakajan3@gmail.com");
//         driver.findElement(By.name("reg_passwd__")).sendKeys("0777507231");
//         driver.findElement(By.name("birthday_day")).sendKeys("10");
//         driver.findElement(By.name("birthday_month")).sendKeys("Jun");//u_0_a
//         driver.findElement(By.name("birthday_year")).sendKeys("1996");
//         driver.findElement(By.name("sex")).click();
//       //  driver.findElement(By.class("_58mt")).sendKeys("1996");
//         driver.findElement(By.name("websubmit")).click();
         driver.findElement(By.name("username")).sendKeys("root");
         driver.findElement(By.name("password")).sendKeys("toor");
        
         
         System.out.println("Login Good");
	}

}
