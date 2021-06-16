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

    @FindBy(css = "button[matbadgecolor='accent']")
    private WebElement addCountryBtn;

    @FindBy(css = "input[id='ms-text-field-2']")
    private WebElement addCountryName;

    @FindBy(css = "input[id='ms-text-field-3']")
    private WebElement addCountryCode;

    @FindBy(css = "button[class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    private WebElement saveBtn;

    @FindBy(css = "div[class='hot-toast-message']")
    private WebElement msjContainer;

    public WebElement getSetupOne() {
        return setupOne;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getAddCountryBtn() {
        return addCountryBtn;
    }

    public WebElement getAddCountryName() {
        return addCountryName;
    }

    public WebElement getAddCountryCode() {
        return addCountryCode;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getMsjContainer() {
        return msjContainer;
    }
}
