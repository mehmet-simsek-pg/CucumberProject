package StepDefinitions;

import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountryStep  {

    LeftNav leftNav=new LeftNav();

    @Then("^Navigate to country page$")
    public void navigate_to_country_page() {


        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        leftNav.clickFunction(leftNav.getCountry());
    }

    @When("^Create a country$")
    public void create_a_country()  {

    }

    @Then("^Success massage should be displayed$")
    public void success_massage_should_be_displayed()  {

    }

}
