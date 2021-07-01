package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class ExamStep extends Parent {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;
    private final FormContent formContent;

    public ExamStep(LeftNav leftNav, DialogContent dialogContent,FormContent formContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
        this.formContent=formContent;
    }

    @When("^Navigate to exam page$")
    public void navigate_to_exam_page() {
        leftNav.clickFunction(leftNav.getEntranceExamsOne());
        leftNav.clickFunction(leftNav.getSetupTree());
        leftNav.clickFunction(leftNav.getEntranceExamsTwo());
    }

    @Then("^Create a Exam as \"([^\"]*)\"$")
    public void create_a_Exam_as(String examName)  {
       dialogContent.clickFunction(dialogContent.getAddBtn());
       dialogContent.sendKeysFunction(formContent.getFormInput(),examName);
       dialogContent.clickFunction(dialogContent.getAcademicPeriod());
       dialogContent.clickFunction(dialogContent.getAcademicPeriod2());
       dialogContent.clickFunction(dialogContent.getGradeLevel());
       dialogContent.clickFunction(dialogContent.getGradeLevel2());
       dialogContent.clickFunction(dialogContent.getAcceptCookies());
       dialogContent.clickFunction(dialogContent.getSaveBtn());
    }

    @When("^User delete the \"([^\"]*)\" from form$")
    public void userDeleteTheFromForm(String examName)  {
        dialogContent.scrollUpToElement(dialogContent.getRightScroll());
        dialogContent.sendKeysFunction(dialogContent.getFormSearchInput(), examName);
        dialogContent.clickFunction(dialogContent.getSearchBtn());
        dialogContent.waitUntilListLessThan(By.xpath("//ms-delete-button//button"),2);
        dialogContent.clickFunction(dialogContent.getDeleteBtn());
        dialogContent.clickFunction(dialogContent.getDeleteDialog());
    }
}
