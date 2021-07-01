package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class CountryStep {
    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public CountryStep(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @Then("^Navigate to country page$")
    public void navigate_to_country_page() {

        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        leftNav.clickFunction(leftNav.getCountry());
    }

    @When("^Create a country$")
    public void create_a_country() {

        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), "Dortmund Merkez1");
        leftNav.sendKeysFunction(dialogContent.getInputCode(), "44369");
        leftNav.clickFunction(dialogContent.getSaveBtn());

    }

    @Then("^Success massage should be displayed$")
    public void success_massage_should_be_displayed() {
        leftNav.verifyElementContainsText(dialogContent.getSuccessMessage(), "successfully");
    }

    @When("^Create a country name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void create_a_country_name_as_code_as(String countryName, String countryCode) {
        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), countryName);
        leftNav.sendKeysFunction(dialogContent.getInputCode(), countryCode);
        leftNav.clickFunction(dialogContent.getSaveBtn());

    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String oldCountryName, String newCountryName) {
       dialogContent.sendKeysFunction(dialogContent.getSearchInputName(),oldCountryName);
       dialogContent.clickFunction(dialogContent.getSearchBtn());
       dialogContent.waitUntilListLessThan(By.xpath("//ms-edit-button//button"),2);
       dialogContent.clickFunction(dialogContent.getEditBtn());
       dialogContent.sendKeysFunction(dialogContent.getInputName(),newCountryName);
       dialogContent.clickFunction(dialogContent.getSaveBtn());
    }
}
