package tests.benuVaistine;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ShoppingCart extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.benuVaistine.ShoppingCart.open();
        pages.benuVaistine.ShoppingCart.closeCookies();
        pages.benuVaistine.ShoppingCart.closeAdd();
    }

    @Test
    public void testingAddToCart() {
        String expectedCartMessage = "Jūsų krepšelyje yra 1 prekės";
        String actualCartMessage;

        pages.benuVaistine.ShoppingCart.enterToSale();
        pages.benuVaistine.ShoppingCart.chooseItemFromSale();
        pages.benuVaistine.ShoppingCart.clickItemToCartButton();
        pages.benuVaistine.ShoppingCart.clickViewCartButton();
        actualCartMessage = pages.benuVaistine.ShoppingCart.readCartMessage();

        Assert.assertEquals(actualCartMessage, expectedCartMessage);
    }
}
