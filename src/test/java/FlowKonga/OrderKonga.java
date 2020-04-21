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

        driver.findElement(By.label=("Email or phone")).sendKeys("alabimichael23@gmail.com");

        driver.findElement(By.label=("Enter your password")).sendKeys("Samsung@111");

        driver.findElement(By.id("Next")).click();

}

    {
        driver.findElement(By.id("https://www.konga.com/category/computers-accessories-5227")).click();

        driver.findElement(By.id("https://www.konga.com/category/phones-tablets-5294?menu=Phones and Tablets > Mobile")).click();

        driver.findElement(By.label=("Search for products, brands and categories...")).sendKeys("Samsung");

        driver.findElement(By.id("Searchbutton"))

        driver.findElement(By.id("Add To Cart button")).click();
        driver.findElement(By.id("cart")).click();

    }

public static void main(String args[]) throws InterruptedException {
        OrderKonga = new OrderKonga();
        OrderKonga.setUp();
        }
