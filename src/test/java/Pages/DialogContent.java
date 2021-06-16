package Pages;

import Utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]")
    private WebElement addBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement inputName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement inputCode;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'error')]")
    public WebElement errorMessage;

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getInputCode() {
        return inputCode;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

}
