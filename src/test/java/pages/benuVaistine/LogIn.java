package pages.benuVaistine;

import pages.Common;
import pages.Locators;

public class LogIn {

    public static void open() {
        pages.Common.openUrl("https://www.benu.lt/prisijungimas");
    }

    public static void enterName(String expectedName) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.LogIn.inputName,
                expectedName
        );
    }

    public static void enterSurname(String expectedSurname) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.LogIn.inputSurname,
                expectedSurname
        );
    }

    public static void enterEmail(String expectedEmail) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.LogIn.inputEmail,
                expectedEmail
        );
    }
    public static void enterBirthDate(String expectedBirthDate) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.LogIn.inputBirthDate,
                expectedBirthDate
        );
    }

    public static void enterPassword(String expectedPassword) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.LogIn.inputPassword,
                expectedPassword
        );
    }
    public static void enterPasswordAgain(String expectedPasswordAgain) {
        Common.sendKeysByAction(
                Locators.BenuVaistine.LogIn.inputPasswordAgain,
                expectedPasswordAgain
        );
    }

    public static void markPrivacyPolicyBox() {
        pages.Common.clickByAction(Locators.BenuVaistine.LogIn.checkPrivacyPolicyBox);
    }

    public static void clickRegisterButton() {
        pages.Common.clickByAction(Locators.BenuVaistine.LogIn.buttonRegister);
    }
}
