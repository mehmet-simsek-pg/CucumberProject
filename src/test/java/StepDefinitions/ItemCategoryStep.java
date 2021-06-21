package StepDefinitions;


import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ItemCategoryStep {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public ItemCategoryStep(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @And("^Navigate to Item Category page$")
    public void navigateToItemCategoryPage() {
        leftNav.clickFunction(leftNav.getInventory());
        leftNav.clickFunction(leftNav.getSetupInventory());
        leftNav.clickFunction(leftNav.getItemCategories());
    }

    @When("^User create a item categories name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userCreateAItemCategoriesNameAsShortNameAs(String inventoryItemName, String userTypeOption)  {
        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), inventoryItemName);
        leftNav.clickFunction(dialogContent.getUserType());
        leftNav.selectByList(dialogContent.getRoleOption(),userTypeOption);
        leftNav.clickFunction(dialogContent.getSaveBtn());
    }
}
