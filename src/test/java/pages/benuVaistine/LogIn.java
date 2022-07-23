package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class LogIn {

    public static void open() {
        pages.Common.openUrl("https://www.benu.lt/prisijungimas");
    }

    public static void closeCookies() {
        Common.waitForElementToBeVisible(Locators.BenuVaistine.HomePage.formCookies);
        Common.clickElement(Locators.BenuVaistine.HomePage.buttonCloseCookies);
    }

    public static void enterLoginEmail(String expectedLoginEmail) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputLoginEmail,
                expectedLoginEmail
        );
    }

    public static void enterLoginPassword(String expectedLoginPassword) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputLoginPassword,
                expectedLoginPassword
        );
    }

    public static void clickButtonLogin() {pages.Common.clickByAction(
                Locators.BenuVaistine.LogIn.buttonLogin);
    }

    public static String readLoginMessage() {
        return Common.getElementText(Locators.BenuVaistine.LogIn.fieldLoginMessage);
    }

    public static void startRegistration() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.LogIn.startRegistrationClick);
        pages.Common.clickByAction(Locators.BenuVaistine.LogIn.startRegistrationClick);
    }

    public static void enterName(String expectedName) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputName,
                expectedName
        );
    }

    public static void enterSurname(String expectedSurname) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputSurname,
                expectedSurname
        );
    }

    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputEmail,
                expectedEmail
        );
    }

    public static void enterPhoneNumber(String expectedPhoneNumber) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputPhoneNumber,
                expectedPhoneNumber
        );
    }

    public static void enterBirthDate(String expectedBirthDate) {
        Common.sendKeysToElementByAction(Locators.BenuVaistine.LogIn.inputBirthDate,
                expectedBirthDate
        );
    }

    public static void enterPassword(String expectedPassword) {
        Common.setElementValue(Locators.BenuVaistine.LogIn.inputPassword,
                expectedPassword
        );
    }

    public static void enterPasswordAgain(String expectedPasswordAgain) {
        Common.setElementValue(Locators.BenuVaistine.LogIn.inputPasswordAgain,
                expectedPasswordAgain
        );
    }

    public static void markPrivacyPolicyBox() {
        pages.Common.clickByAction(
                Locators.BenuVaistine.LogIn.checkPrivacyPolicyBox);
    }

    public static void clickRegisterButton() {
        pages.Common.waitForElementToBeCickable(Locators.BenuVaistine.LogIn.buttonRegister);
        pages.Common.clickByAction(Locators.BenuVaistine.LogIn.buttonRegister);
    }

    public static String readRegistrationMessage() {
        pages.Common.waitForElementToBeVisible(Locators.BenuVaistine.LogIn.successfullRegistrationMessage);
        pages.Common.waitForTextToBeInLogin(Locators.BenuVaistine.LogIn.successfullRegistrationMessage);
        return Common.getElementText(Locators.BenuVaistine.LogIn.successfullRegistrationMessage);
    }
}

