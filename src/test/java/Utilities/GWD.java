package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;

public class GWD {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language","EN");

        if (driver == null) {  //  work 1 time at First
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        }

        return driver;
    }

    public static void quitDriver() {

        // wait a little bit on the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // close driver
        if (driver != null) {  //  work 1 time at First
            driver.quit();
            driver = null;
        }


    }


}
