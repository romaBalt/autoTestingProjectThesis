package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeCickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForTextToBeInPharmacySearch(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.textToBe(locator, "Žirmūnų g. 64, Hyper RIMI"));
    }

    public static void waitForTextToBeInLogin(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(
                ExpectedConditions.textToBe(
                        locator, "Į Jūsų el. paštą išsiųstas laiškas su patvirtinimo nuoroda. " +
                                "Paspauskite ant jos, kad aktyvuotumėte paskyrą."));
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElementByAction(By locator, String message) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.sendKeys(element, message);
        action.perform();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click(element);
        action.perform();
    }
}


