package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_07_DataTableExample.feature"
        },
        glue = {"StepDefinitions"}
)
public class _02_TestRunnerSomeFeatures extends AbstractTestNGCucumberTests {
}
