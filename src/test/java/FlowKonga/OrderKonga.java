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

        driver.findElement(By.id("https://accounts.google.com/o/oauth2/v2/auth?response_type=code&redirect_uri=https://www.konga.com/account/login&scope=openid%20profile%20email&client_id=840453489448-es8on0but8hsibv1fmb13odjrae1rv87.apps.googleusercontent.com&ss_domain=https://www.konga.com&include_granted_scopes=true&origin=https://www.konga.com&gsiwebsdk=2&access_type=offline&state={%22platform%22:%22google%22,%22returnUrl%22:%22/%22}")).click();

        driver.findElement(By.id("Email or phone")).sendKeys("alabimichael23@gmail.com");

        driver.findElement(By.id=("Enter your password")).sendKeys("xxxXxYYY@");

        driver.findElement(By.id("Next")).click();

}

public static void main(String args[]) throws InterruptedException {
        OrderKonga = new OrderKonga();
        OrderKonga.setUp();
        }
