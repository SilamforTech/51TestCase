package Selenium5;
WebDriver driver;
Select select;

@Before
public void setUp() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    driver.manage().window().maximize();

    // implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


@Test
public void staticDropDown() {
    
    
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
    
   
    driver.findElement(By.id("menu_admin_viewAdminModule")).click();

    select = new Select(driver.findElement(By.id("searchSystemUser_userType")));
    
    select.selectByVisibleText("Admin");
    
    
    select = new Select(driver.findElement(By.id("searchSystemUser_status")));

    
    select.selectByVisibleText("Enabled");
   
    s.selectByvalue("0");
    s.selectByIndex("2");
    s.selectByVisibleTest("0");
    		
  driver.findElement(By.xpath("main-container"/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]))
    
    
    
    
    
    
    