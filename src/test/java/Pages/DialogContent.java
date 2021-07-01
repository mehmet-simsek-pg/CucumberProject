package Pages;

import Utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles']//input")
    private WebElement userType;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'error')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExists;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement InputShortName;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchInputName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchBtn;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteBtn;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialog;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editBtn;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(css = "mat-option[role='option']")
    private List<WebElement> roleOption;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

    @FindBy(xpath = "//input[@id='ms-integer-field-0']")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(id = "mat-select-value-7")
    private WebElement academicPeriod;

    @FindBy(css = "span[class='mat-option-text']")
    private WebElement academicPeriod2;

    @FindBy(id = "mat-select-value-9")
    private WebElement gradeLevel;

    @FindBy(css = "span[class='mat-option-text']")
    private WebElement gradeLevel2;

    @FindBy(xpath = "//mat-form-field//input")
    private WebElement formSearchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getAcademicPeriod() {
        return academicPeriod;
    }

    public WebElement getAcademicPeriod2() {
        return academicPeriod2;
    }

    public WebElement getGradeLevel() {
        return gradeLevel;
    }

    public WebElement getGradeLevel2() {
        return gradeLevel2;
    }

    public WebElement getFormSearchInput() {
        return formSearchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getPriorityInput() {
        return priorityInput;
    }

    public WebElement getPriorityCode() {
        return priorityCode;
    }

    public WebElement getIntegrationCode() {
        return integrationCode;
    }

    public WebElement getRightScroll() {
        return rightScroll;
    }

    public List<WebElement> getRoleOption() {
        return roleOption;
    }

    public WebElement getUserType() {
        return userType;
    }

    public WebElement getSearchInputName() {
        return searchInputName;
    }

    public WebElement getDeleteDialog() {
        return deleteDialog;
    }

    public WebElement getCloseDialog() {
        return closeDialog;
    }

    public WebElement getAlreadyExists() {
        return alreadyExists;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getInputShortName() {
        return InputShortName;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

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
