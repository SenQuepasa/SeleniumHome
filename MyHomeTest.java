package selenium.home;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyHomeTest extends SearchPage {
    private final WebDriver driver;

    public MyHomeTest(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public String getResult(){
        Assert.assertTrue(ResultField.getText().contains("Пенз"));
    }

}
