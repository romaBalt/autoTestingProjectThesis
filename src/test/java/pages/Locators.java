package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class BenuVaistine {
        public static class HomePage {

            public static By formCookies = By.xpath("//*[@id=\"CybotCookiebotDialogBody\"]");
            public static By buttonCloseCookies = By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]");
            public static By formAdd = By.xpath("//*[@id=\"popupBanner-2584\"]/div/div/div[1]/div/div/a/img");
            public static By buttonCloseAdd = By.xpath("//*[@id=\"popupBanner-2584\"]/div/div/button/i");
            public static By fieldSearchClicK = By.xpath("//*[@id=\"headerSearch\"]");
            public static By inputSearchItem = By.xpath("//*[@id=\"headerSearch\"]");
//            public static By selectItemFromTheList = By.xpath("//*[@id=\"tt-4917af14-69a3-d510-fc05-33b96000afeb\"]");
//            public static By clickOnItem = By.xpath("//*[@id=\"tt-a420b030-7499-abde-3103-97c306536087\"]");
//            public static By doubleClickOnItem = By.xpath("");
//            public static By clickOnItem = By.xpath("");
//            public static By searchItem = By.xpath("");
//            public static By buttonSearch = By.xpath("");
//        }
//
       }
       public static class LogIn{

            public static By registerButtonClick = By.xpath("//*[@class=\"left button button--white button--shadow bind-showRegistrationForm\"]");
            public static By inputName = By.xpath("//*[@id=\"coreRegistrationForm\"]/div[2]/input");
            public static By inputSurname = By.xpath("//*[@id=\"coreRegistrationForm\"]/div[3]/input");
            public static By inputEmail = By.xpath("//*[@id=\"coreRegistrationForm\"]/div[4]/input");
            public static By inputBirthDate = By.xpath("//*[@id=\"datepicker\"]");
            public static By inputPassword = By.xpath("//*[@id=\"coreRegistrationForm\"]/div[8]/input[2]");
            public static By inputPasswordAgain = By.xpath("//*[@id=\"coreRegistrationForm\"]/div[9]/input");
            public static By checkPrivacyPolicyBox = By.xpath("//*[@id=\"coreRegistrationForm\"]/div[10]/div/label/span[2]");
            public static By buttonRegister = By.xpath("//*[@id=\"coreRegistrationForm\"]/button");

       }

    }
}
