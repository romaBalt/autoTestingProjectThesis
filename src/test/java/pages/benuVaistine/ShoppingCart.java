package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class ShoppingCart {

    public static void open() {
        pages.Common.openUrl("https://www.benu.lt/");
    }

    public static void closeCookies() {
        Common.waitForElementToBeVisible(Locators.BenuVaistine.HomePage.formCookies);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseCookies);
    }

    public static void closeAdd() {
        Common.waitForElementToBeVisible(Locators.BenuVaistine.HomePage.formAdd);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseAdd);
    }

    public static void enterToSale() {
        pages.Common.clickByAction(Locators.BenuVaistine.ShoppingCart.goToSaleItems);
    }

    public static void chooseItemFromSale() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.ShoppingCart.selectItemFromSale);
        pages.Common.clickByAction(Locators.BenuVaistine.ShoppingCart.selectItemFromSale);
    }

    public static void clickItemToCartButton() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.ShoppingCart.buttonPutItemToCart);
        pages.Common.clickByAction(Locators.BenuVaistine.ShoppingCart.buttonPutItemToCart);
    }

    public static void clickViewCartButton() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.ShoppingCart.buttonViewCart);
        pages.Common.clickByAction(Locators.BenuVaistine.ShoppingCart.buttonViewCart);
    }

    public static String readCartMessage() {
        return Common.getElementText(Locators.BenuVaistine.ShoppingCart.fieldCartMessage);
    }
}
