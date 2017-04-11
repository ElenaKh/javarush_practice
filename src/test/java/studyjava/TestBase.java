package studyjava;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Elena on 4/11/2017.
 */
public class TestBase {
    protected WebDriver driver;
    protected MainPage mainPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
             mainPage = new MainPage(driver);
    }

    @After
    public void stop() {
        driver.quit();
    }



}
