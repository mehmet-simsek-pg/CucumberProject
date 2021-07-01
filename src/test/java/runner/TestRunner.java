package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json",
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {


}
