package tests.benuVaistine;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogIn extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.benuVaistine.HomePage.open();
        pages.benuVaistine.HomePage.closeCookies();

    }
    @Test
    public void testingRegistrationInputs(){
        String inputName = "Roma";
        String inputSurname = "Baltrusaitis";
        String inputEmail = "romabalt@gmail.com";
        String inputBirthDate = "1988 08 08";
        String inputPassword = "Pirktigera67";
        String inputPasswordAgain = "Pirktigera67";

        pages.benuVaistine.LogIn.enterName(inputName);
        pages.benuVaistine.LogIn.enterSurname(inputSurname);
        pages.benuVaistine.LogIn.enterEmail(inputEmail);
        pages.benuVaistine.LogIn.enterBirthDate(inputBirthDate);
        pages.benuVaistine.LogIn.enterPassword(inputPassword);
        pages.benuVaistine.LogIn.enterPasswordAgain(inputPasswordAgain);

    }

}
