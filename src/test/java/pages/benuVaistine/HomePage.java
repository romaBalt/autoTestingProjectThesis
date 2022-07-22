package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class HomePage {


    public static void open() {
        pages.Common.openUrl("https://www.benu.lt/?gclid=EAIaIQobChMI_PWzsvyL-QIVUOJ3Ch30yQnzEAAYASAAEgLH7_D_BwE");
    }

    public static void  closeCookies() {
        Common.waitForCookiesFormToBeVisible(Locators.BenuVaistine.HomePage.formCookies);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseCookies);
    }
    public static void closeAdd() {
        Common.waitForAddFormToBeVisible(Locators.BenuVaistine.HomePage.formAdd);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseAdd);

        }
    public static void performClick() {
        pages.Common.clickByAction(Locators.BenuVaistine.HomePage.fieldSearchClicK);
    }

    public static void enterSearchItem(String expectedItem) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.HomePage.inputSearchItem,
                expectedItem
        );
    }
//
//    public static void selectItem(String value) {
//        Common.selectOptionByValue(
//                Locators.BenuVaistine.HomePage.selectItemFromTheList,
//                value
//        );
//    }
//
//    public static void performClickOnItem() {
//        pages.Common.doubleClickByAction(Locators.BenuVaistine.HomePage.clickOnItem);
//    }
////
//    public static String readSearchResult() {
//        return Common.getElementText(Locators.BenuVaistine.HomePage.searchItem);
//    }
}




