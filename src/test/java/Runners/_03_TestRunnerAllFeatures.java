package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}  // all the features going to start the test
        ,glue = {"StepDefinitions"}
)
public class _03_TestRunnerAllFeatures extends AbstractTestNGCucumberTests {
}
