package SeleniumDay7;

public class WindowsNewTab {
	WebDriver driver;
    Actions act;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    
    @Test
    
    public void windowNewTab() throws InterruptedException {
        //clicks on NewTab blue button
        driver.findElement(By.xpath("//*[@id='tabButton']")).click();
        
        //verifies that i am still on homePage
        System.out.println("HomePage -- ToolsQA = "+ driver.getTitle());

        Set<String> ids = driver.getWindowHandles();
        
        Iterator<String> it = ids.iterator();
        
        String homePage = it.next();
        String newTab = it.next();
        
        driver.switchTo().window(newTab);
        
        Thread.sleep(3000);
        System.out.println("NewTab -- https://demoqa.com/sample = " + driver.getCurrentUrl());

        
        
        
        
        
        
        
    }
}
