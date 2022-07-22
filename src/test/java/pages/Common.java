package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;
import utils.Driver;

public class Common {
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By Locator) {
        return Driver.getDriver().findElement(Locator);
    }

    public static void waitForCookiesFormToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void waitForAddFormToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void sendKeysToElement(By locator, String expectedSearchItem) {
        getElement(locator).getText();

    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();
}


    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static void doubleClickByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.doubleClick(element);
        action.perform();

    }
    public static void waitForElementAttributeContains(
            By locator,
            String attributeName,
            String attributeValue) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(
                ExpectedConditions.attributeContains(
                        locator,
                        attributeName,
                        attributeValue
                )
        );
    }
}
