package selenium.home;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static WebDriver driver;

    public BasePage(WebDriver driver) {
    }

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("www.yandex.ru");
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
