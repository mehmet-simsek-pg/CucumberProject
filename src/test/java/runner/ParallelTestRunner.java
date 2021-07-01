package runner;

import Utilies.BaseWebDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/login.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}

)
public class ParallelTestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void before(String browser){
        BaseWebDriver.browserName.set(browser);
    }

    @AfterClass
    public static void setup()
    {
        Reporter.loadXMLConfig(new File("src/test/java/xmlFiles/ExtendReport.xml"));
        Reporter.setSystemInfo("User Name", "Mehmet Simsek");
        Reporter.setSystemInfo("Application Name", "Basqar Project");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA Manager");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }
}
