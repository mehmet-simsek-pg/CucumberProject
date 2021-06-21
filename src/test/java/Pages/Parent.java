package Pages;

import Utilies.BaseWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Parent {
    WebDriverWait wait;
    JavascriptExecutor js;

    public Parent() {
        js = (JavascriptExecutor) BaseWebDriver.getDriver();
        wait = new WebDriverWait(BaseWebDriver.getDriver(), 30);
    }

    public void sendKeysFunction(WebElement webElement, String value) {
        waitUntilVisible(webElement);
        scrollToElement(webElement);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public void clickFunction(WebElement webElement) {
        waitUntilClickable(webElement);
        scrollToElement(webElement);
        webElement.click();
    }

    public void waitUntilClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void scrollToElement(WebElement webElement) {
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }
    public void scrollUpToElement(WebElement webElement) {
        js.executeScript("arguments[0].setAttribute('style','top:0px');", webElement);
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void waitUntilVisible(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void myWait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyElementContainsText(WebElement webElement, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
        Assert.assertTrue(webElement.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilListLessThan(By selector, int num) {
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, num));
    }

    public void selectByValue(WebElement webElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    public void selectByList(List<WebElement> userList, String userTypeOption) {
        for (WebElement user : userList) {
            if (user.getText().contains(userTypeOption)) {
                clickFunction(user);
                break;
            }
        }
    }
}
