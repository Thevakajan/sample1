package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("project"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.lk/");
        
        driver.close();
	}
} 
