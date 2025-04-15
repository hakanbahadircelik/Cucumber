package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} // simple report
)
public class _07_TestRunnerExtendReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("",""); // username : baha
        // adding extra info to the report of test
    }

}
