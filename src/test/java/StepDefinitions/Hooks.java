package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before() {
//        System.out.println("scenario started ");
    }

    @After
    public void after(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] onMemory = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(onMemory, "image/png", "screenshot name");
        }

        //  System.out.println("scenario finished");
        // if it works true, I will call quit
        GWD.quitDriver();
    }


}
