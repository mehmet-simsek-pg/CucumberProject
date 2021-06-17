package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CitizenShipStep {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @Then("^Navigate to citizenship page$")
    public void navigate_to_citizenship_page() {
        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        leftNav.clickFunction(leftNav.getCitizenShip());
    }

    @When("^User a citizenship name as \"([^\"]*)\" shortname as \"([^\"]*)\"$")
    public void userACitizenshipNameAsShortnameAs(String citizenShipName, String shortName) {
        dialogContent.clickFunction(dialogContent.getAddBtn());
        dialogContent.sendKeysFunction(dialogContent.getInputName(), citizenShipName);
        dialogContent.sendKeysFunction(dialogContent.getInputShortName(), shortName);
        dialogContent.clickFunction(dialogContent.getSaveBtn());
    }

    @Then("^Already exists message should be displayed$")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dialogContent.verifyElementContainsText(dialogContent.getAlreadyExists(), "already exists");
    }

    @And("^Click on close button$")
    public void clickOnCloseButton() {
        dialogContent.clickFunction(dialogContent.getCloseDialog());
    }

    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String citizenShipName){
        dialogContent.sendKeysFunction(dialogContent.getSearchInputName(), citizenShipName);
        dialogContent.clickFunction(dialogContent.getSearchBtn());
        dialogContent.waitUntilListLessThan(dialogContent.getDeleteBtn());
        dialogContent.clickFunction(dialogContent.getDeleteBtn());
        dialogContent.clickFunction(dialogContent.getDeleteDialog());
    }
}
