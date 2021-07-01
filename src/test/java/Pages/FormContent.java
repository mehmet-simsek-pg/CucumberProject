package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormContent extends Parent{
    @FindBy(xpath = "//mat-form-field//input")
    private WebElement formInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='middleName']//input")
    private WebElement middleName;

    @FindBy(xpath = "//mat-select[@formcontrolname='gender']")
    private WebElement gender;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement male;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getMiddleName() {
        return middleName;
    }

    public WebElement getGender() {
        return gender;
    }

    public WebElement getMale() {
        return male;
    }

    public WebElement getFormInput() {
        return formInput;
    }
}
