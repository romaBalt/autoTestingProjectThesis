package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class FindPharmacy {

    public static void open() {
        pages.Common.openUrl("https://www.benu.lt/");
    }

    public static void closeCookies() {
        Common.waitForCookiesFormToBeVisible(Locators.BenuVaistine.HomePage.formCookies);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseCookies);
    }

    public static void closeAdd() {
        Common.waitForAddFormToBeVisible(Locators.BenuVaistine.HomePage.formAdd);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseAdd);

    }

    public static void enterPharmacySearch() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.FindPharmacy.buttonPharmacySearch);
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.buttonPharmacySearch);

    }

    public static void enterCitySearch() {
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.buttonSearchCity);

    }

    public static void searchCityFromList() {
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.chooseCityFromList);

    }

    public static void checkBox() {
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.checkBoxOnDuty);

    }

    public static void clickOnResult() {
        pages.Common.clickByAction(Locators.BenuVaistine.FindPharmacy.chooseResult);

    }
}
