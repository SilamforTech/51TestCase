package BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main (String[] args) throws InterruptedException {
   
		System.setProperty("webdriver.chrome.driver", "/Users/slamkahar/Downloads/chromedriver");
	
		WebDriver driver = new ChromeDriver();
			
//	driver.get("https://www.techcircleschool.com/");	
//	driver.getTitle().toString();  
//	driver.close();
//	driver.quit();	
//	String pageSource = driver.getPageSource().toString();
	
		driver.navigate().to("https://www.amazon.com/");
	
	 driver.manage().window().maximize();
     
	 driver.findElement(By.id("input"));

     driver.findElement(By.id("twotabsechtextbox"));
    
     driver.findElement(By.id("nav-search-submit-button"));
     
     driver.quit();
     
	}
}