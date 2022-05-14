package seleniumday

import org.openqa.selenium.WebDriver;

1;

public class selenimday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.google.com");
	  
	  driver.getTitle().toString();
	
	}

}


