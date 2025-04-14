package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // features paths
        glue = {"StepDefinitions"} // write the file of StepDefinitions

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

}
