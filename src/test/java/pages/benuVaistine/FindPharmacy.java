package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class FindPharmacy {

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

    public static void enterPharmacySearch() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.FindPharmacy.buttonPharmacySearch);
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.buttonPharmacySearch);
    }

    public static void enterCitySearch() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.FindPharmacy.buttonSearchCity);
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.buttonSearchCity);
    }

    public static void searchCityFromList() {
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.chooseCityFromList);
    }

    public static void checkBox() {
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.checkBoxOnDuty);
    }

    public static void clickOnResult() {
        pages.Common.waitForTextToBeInPharmacySearch(Locators.BenuVaistine.FindPharmacy.chooseResult);
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.chooseResult);
    }

    public static String readPharmacySearchResult() {
        return Common.getElementText(Locators.BenuVaistine.FindPharmacy.fieldPharmacySearchResult);
    }
}
