package tests.benuVaistine;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class HomePage extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.benuVaistine.HomePage.open();
        pages.benuVaistine.HomePage.closeCookies();
        pages.benuVaistine.HomePage.closeAdd();
    }

    @Test
    public void testingSearchInput() {
        String expectedItem = "vitaminas c";
        String actualItem;

        pages.benuVaistine.HomePage.enterSearchItem(expectedItem);
        pages.benuVaistine.HomePage.performClick();
        actualItem = pages.benuVaistine.HomePage.readSearchResult();

        Assert.assertTrue(actualItem.contains(expectedItem));
    }
}

