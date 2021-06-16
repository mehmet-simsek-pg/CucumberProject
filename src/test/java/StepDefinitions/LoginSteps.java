package StepDefinitions;

import Pages.DialogContent;
import Utilies.BaseWebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {
    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {

        WebDriver driver = BaseWebDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button() {

        dialogContent.sendKeysFunction(dialogContent.getUsername(), "richfield.edu");
        dialogContent.sendKeysFunction(dialogContent.getPassword(), "Richfield2020!");
        dialogContent.clickFunction(dialogContent.getLoginBtn());

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {
        dialogContent.verifyElementContainsText(dialogContent.getDashboard(),"Dashboard");
    }

}
