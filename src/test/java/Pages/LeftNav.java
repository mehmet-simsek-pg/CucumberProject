package Pages;

import Utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement cities;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    public WebElement getStates() {
        return states;
    }

    public WebElement getCities() {
        return cities;
    }

    public WebElement getNationalities() {
        return nationalities;
    }

    public WebElement getCitizenShip() {
        return citizenShip;
    }

    public WebElement getSetupOne() {
        return setupOne;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getCountry() {
        return country;
    }

}
