package Gamil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selanium\\chromedriver_win32_3\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Selenium+for+Automated+Website+Testing");
		///String at = driver.getTitle();
	}
}
