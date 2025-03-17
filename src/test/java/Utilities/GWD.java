package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GWD {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        driver = new ChromeDriver();  //  jenkins : start without head, work on memory
        driver.manage().window().maximize(); // makes fullScreen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR

        return driver;
    }

}
