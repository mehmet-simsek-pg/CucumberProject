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

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupInventory;

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

    @FindBy(xpath = "(//span[text()='Inventory'])[1]")
    private WebElement inventory;

    @FindBy(xpath = "(//span[text()='Item Categories'])[1]")
    private WebElement itemCategories;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTree;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement employees ;

    public WebElement getHumanResources() {
        return humanResources;
    }

    public WebElement getEmployees() {
        return employees;
    }

    public WebElement getEntranceExamsOne() {
        return entranceExamsOne;
    }

    public WebElement getSetupTree() {
        return setupTree;
    }

    public WebElement getEntranceExamsTwo() {
        return entranceExamsTwo;
    }

    public WebElement getFees() {
        return fees;
    }

    public WebElement getItemCategories() {
        return itemCategories;
    }

    public WebElement getSetupInventory() {
        return setupInventory;
    }

    public WebElement getInventory() {
        return inventory;
    }

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
