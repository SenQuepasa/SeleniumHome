package selenium.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends MainPage {
    public By ResultField = By.cssSelector("a[accesskey='2'");

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getResult() {
        return driver.findElement(ResultField).getText();
    }
}
