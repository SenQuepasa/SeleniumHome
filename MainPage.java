package selenium.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private By SeacrhField = By.cssSelector("*[id='text']");
    private By SearchButton = By.cssSelector("button[type='submit']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void input(String source){
        driver.findElement(SeacrhField).sendKeys("Погода в Пензе");
        driver.findElement(SearchButton).click();
    }
}