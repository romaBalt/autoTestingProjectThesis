package tests.benuVaistine;

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
    public void testingSearchinput() {
        String expectedItem = "vitaminas c";
//        String actualItem;


        pages.benuVaistine.HomePage.performClick();
        pages.benuVaistine.HomePage.enterSearchItem(expectedItem);
//        pages.benuVaistine.HomePage.selectItem(expectedItem);
//        pages.benuVaistine.HomePage.performClickOnItem();


    }


}

