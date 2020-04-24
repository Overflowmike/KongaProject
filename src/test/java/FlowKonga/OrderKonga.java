package FlowKonga;

import java.util.concurrent.TimeUnit;

public class OrderKonga {

    private WebDriver driver;

    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.konga.com/category/phones-tablets-5294");

        Thread.wait(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("https://www.konga.com/account/login?return_url=/")).click();

        driver.findElement(By.id("https://www.facebook.com/v3.3/dialog/oauth?client_id=609981359188266&redirect_uri=https://www.konga.com/account/login&response_type=code&scope=email,public_profile&state={%22platform%22:%22facebook%22,%22returnUrl%22:%22/%22}")).click();

        driver.findElement(By.id("Email or phone")).sendKeys("princefmaous01@yahoo.com");

        driver.findElement(By.id=("Enter your password")).sendKeys("xxxXxYYY@");

        driver.findElement(By.id("Next")).click();

}

public static void main(String args[]) throws InterruptedException {
        OrderKonga = new OrderKonga();
        OrderKonga.setUp();
        }
