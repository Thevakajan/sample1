package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.GoogleSearchPage;
import pages.Screen;

public class GoogleSearchTest {
	  private static WebDriver driver = null;
	public static void main(String[] args) { 
		googleSearch();
	}
   
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("project"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe ");
         driver = new ChromeDriver();
        driver.get("https://www.google.lk/");
        Screen.captureScreenshot(driver, "WelComeGooglePage");
        //driver.findElement(By.name("q")).sendKeys("Automation");
        
        GoogleSearchPage.textbox_search(driver).sendKeys("Thevakajan");
        Screen.captureScreenshot(driver, "TxtTyping");
     // driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
       GoogleSearchPage.button_search(driver).click();
        driver.close();
        
        System.out.println("Test Completed Successfully");
        
	}
	
}
