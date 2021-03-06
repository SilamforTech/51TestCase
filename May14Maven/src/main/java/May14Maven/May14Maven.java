package May14Maven;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class May14Maven {
	@Test
	WebDriver driver;
    Actions act;
    
    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        // driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void drop() {
        act = new Actions(driver);
        
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        
        driver.switchTo().frame(0);
        
        WebElement box = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));    
        act.dragAndDrop(box, target).build().perform();
        
        driver.switchTo().defaultContent();
}

}
