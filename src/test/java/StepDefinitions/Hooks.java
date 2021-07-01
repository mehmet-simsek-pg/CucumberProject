package StepDefinitions;

import Utilies.BaseWebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void before(Scenario scenario) {
        System.out.println("Scenario id: " + scenario.getId());
        System.out.println("Scenario name: " + scenario.getName());
    }

    @After
    public void after(Scenario scenario) {
        System.out.println("Scenario result: " + scenario.getStatus());
        System.out.println("Scenario isFailed ?: " + scenario.isFailed());
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        if (scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) BaseWebDriver.getDriver();
            File file = screenshot.getScreenshotAs(OutputType.FILE);

            try {
                FileHandler.copy(file, new File("screenshots/basqar/" + scenario.getId() + date.format(formatter) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BaseWebDriver.quitDriver();
    }
}

