package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false, // control everything
        // if it false, test starts
        plugin = {"html:target/site/cucumber-pretty.html"} // simple report
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
