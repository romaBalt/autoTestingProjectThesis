package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class BenuVaistine {

        public static class HomePage {

            public static By formCookies = By.xpath("//*[@id=\"CybotCookiebotDialogBody\"]");
            public static By buttonCloseCookies =
                    By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]");
            public static By formAdd =
                    By.xpath("//*[@id=\"popupBanner-2584\"]/div/div/div[1]/div/div/a/img");
            public static By buttonCloseAdd = By.xpath("//*[@id=\"popupBanner-2584\"]/div/div/button/i");
            public static By buttonSearchResults = By.xpath("//button[@type=\"submit\"]");
            public static By inputSearchItem = By.xpath("//*[@id=\"headerSearch\"]");
            public static By fieldSearchResult = By.xpath("//*[@id=\"intuero\"]/div[4]/div[2]/h2/span");
        }

        public static class LogIn {

            public static By inputLoginEmail = By.xpath("//*[@id=\"email\"]");
            public static By inputLoginPassword = By.xpath("//*[@id=\"password\"]");
            public static By buttonLogin = By.xpath("//button[@type=\"submit\"]");
            public static By fieldLoginMessage = By.xpath("//div[@class=\"errorsBox\"]");

            public static By startRegistrationClick =
                    By.xpath("//*[@class=\"left button button--white button--shadow bind-showRegistrationForm\"]");
            public static By inputName =
                    By.xpath("(//input[@name=\"firstName\"])[1]");
            public static By inputSurname =
                    By.xpath("(//input[@name=\"lastName\"])[1]");
            public static By inputEmail =
                    By.xpath("//input[@name=\"email\"]");
            public static By inputPhoneNumber =
                    By.xpath("//input[@name=\"profileData[phone]\"]");
            public static By inputBirthDate =
                    By.xpath("//input[@name=\"profileData[birthDate]\"]");
            public static By inputPassword =
                    By.xpath("//input[@name=\"password\"]");
            public static By inputPasswordAgain =
                    By.xpath("//input[@name=\"password-repeat\"]");
            public static By checkPrivacyPolicyBox =
                    By.xpath("//*[@id=\"coreRegistrationForm\"]/div[10]/div/label/span[2]");
            public static By buttonRegister =
                    By.xpath("//button[@class=\"button loginButton\"]");
            public static By successfullRegistrationMessage =
                    By.xpath("//*[@id=\"coreRegistrationForm\"]");
        }

        public static class ShoppingCart {

            public static By goToSaleItems =
                    By.xpath("//*[@class=\"module-2059 lvl-1 menu_noChilds\"]");
            public static By selectItemFromSale =
                    By.xpath("//*[@id=\"chainLink-12768\"]/div/section/div/div/div[1]/div/div/a/img");
            public static By buttonPutItemToCart =
                    By.xpath("(//button[@class=\"bnButton bnButton--green bnButton--full bind-addToCart\"])[2]");
            public static By buttonViewCart =
                    By.xpath("//*[@class=\"button button--green viewCart\"]");
            public static By fieldCartMessage =
                    By.xpath("//*[@class=\"cart_cartDataAboveCounter\"]");
        }

        public static class FindPharmacy {

            public static By buttonPharmacySearch =
                    By.xpath("//*[@id=\"intuero\"]/header/div[1]/div/div/div[2]/nav/ul[1]/li[2]/a");
            public static By buttonSearchCity =
                    By.xpath("//*[@class=\"customSelectVisible\"]");
            public static By chooseCityFromList = By.xpath(" //div[@data-value=\"Vilnius\"]");
            public static By checkBoxOnDuty = By.xpath("(//span[@class=\"checkbox__mark\"])[2]");
            public static By chooseResult =By.xpath("//*[@class=\"address showSingle\"]");
            public static By fieldPharmacySearchResult =
                    By.xpath("//*[@id=\"intuero\"]/div[4]/div[5]/div[2]/div[1]/div/div[1]/div/div[3]/a/span[1]");
        }
    }
}
