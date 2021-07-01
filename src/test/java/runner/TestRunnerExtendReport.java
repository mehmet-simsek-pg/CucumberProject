package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/login.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}

)
public class TestRunnerExtendReport extends AbstractTestNGCucumberTests {


    public static String reportDate(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        return date.format(formatter);
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
