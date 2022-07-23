package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class HomePage {

    public static void open() {
        pages.Common.openUrl(
                "https://www.benu.lt/?gclid=EAIaIQobChMI_PWzsvyL-QIVUOJ3Ch30yQnzEAAYASAAEgLH7_D_BwE");
    }

    public static void closeCookies() {
        Common.waitForElementToBeVisible(Locators.BenuVaistine.HomePage.formCookies);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseCookies);
    }

    public static void closeAdd() {
        Common.waitForElementToBeVisible(Locators.BenuVaistine.HomePage.formAdd);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseAdd);
    }

    public static void performClick() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.HomePage.buttonSearchResults);
        pages.Common.clickByAction(Locators.BenuVaistine.HomePage.buttonSearchResults);
    }

    public static void enterSearchItem(String expectedItem) {
        Common.sendKeysToElementByAction(
                Locators.BenuVaistine.HomePage.inputSearchItem,
                expectedItem
        );
    }

    public static String readSearchResult() {
        return Common.getElementText(Locators.BenuVaistine.HomePage.fieldSearchResult);
    }
}




