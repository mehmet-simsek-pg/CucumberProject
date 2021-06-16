package StepDefinitions;

import Pages.LeftNav;
import cucumber.api.java.en.Then;

public class CitizenShipStep {

    LeftNav leftNav = new LeftNav();

    @Then("^Navigate to citizenship page$")
    public void navigate_to_citizenship_page() {
        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        leftNav.clickFunction(leftNav.getCitizenShip());
    }
}
