package studyjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Elena on 4/11/2017.
 */
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get("http://info.javarush.ru/page/learning_plan/");
        return this;
    }

    public WebElement choseMenuBtn(String name) {
        List<WebElement> menu = driver.findElements(By.cssSelector(".nav-main"));
        for (WebElement el : menu) {
            if (el.getText().equals(name)) {
                el.click();
                return el;
            }
        }
        return null;

    }
}
