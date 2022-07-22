package tests.benuVaistine;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogIn extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.benuVaistine.LogIn.open();
        pages.benuVaistine.LogIn.closeCookies();

    }

    @Test
    public void testingLoginInputs() {
        String inputLoginEmail = "jonas@jonas.lt";
        String inputLoginPassword = "Jonasjonas123";

        String expectedLoginMessage = "Blogi prisijungimo duomenys";
        String actualLoginMessage;

        pages.benuVaistine.LogIn.enterLoginEmail(inputLoginEmail);
        pages.benuVaistine.LogIn.enterLoginPassword(inputLoginPassword);
        pages.benuVaistine.LogIn.clickButtonLogin();
        actualLoginMessage = pages.benuVaistine.LogIn.readLoginMessage();

        Assert.assertEquals(actualLoginMessage, expectedLoginMessage);
    }

    @Test
    public void testingRegistrationInputs() {
        String inputName = "Roma";
        String inputSurname = "Baltrusaitis";
        String inputEmail = "romabalt@yahoo.com";
        String inputPhoneNumber = "8288822";
        String inputBirthDate = "1988 08 08";
        String inputPassword = "Saulejura123";
        String inputPasswordAgain = "Saulejura123";

        pages.benuVaistine.LogIn.startRegistration();
        pages.benuVaistine.LogIn.enterName(inputName);
        pages.benuVaistine.LogIn.enterSurname(inputSurname);
        pages.benuVaistine.LogIn.enterEmail(inputEmail);
        pages.benuVaistine.LogIn.enterPhoneNumber(inputPhoneNumber);
        pages.benuVaistine.LogIn.enterBirthDate(inputBirthDate);
        pages.benuVaistine.LogIn.enterPassword(inputPassword);
        pages.benuVaistine.LogIn.enterPasswordAgain(inputPasswordAgain);
        pages.benuVaistine.LogIn.markPrivacyPolicyBox();
        pages.benuVaistine.LogIn.clickRegisterButton();
        pages.benuVaistine.LogIn.readRegistrationMessage();

    }

}
