package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    // threadDriver.get() -> take driver from the thread(boru)
    // threadDriver.set(driver) -> set a driver to the thread(boru)

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if(threadBrowserName.get()==null)
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {  //  work 1 time at First

            switch (threadBrowserName.get()){
                case "edge" : threadDriver.set(new EdgeDriver()); break;
                case "chrome" : threadDriver.set(new ChromeDriver()); break;
            }
        }
//  with the name of the browser, create a switch and set it.
        threadDriver.get().manage().window().maximize();
        threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        return threadDriver.get();
    }

    public static void quitDriver() {

        // wait a little bit on the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // close driver
        if (threadDriver.get() != null) {  //  work 1 time at First
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }


    }


}
