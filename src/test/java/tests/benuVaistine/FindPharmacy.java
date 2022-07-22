package tests.benuVaistine;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FindPharmacy extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.benuVaistine.FindPharmacy.open();
        pages.benuVaistine.FindPharmacy.closeCookies();
        pages.benuVaistine.FindPharmacy.closeAdd();
    }


    @Test
    public void testingPharmacySearch(){

        pages.benuVaistine.FindPharmacy.enterPharmacySearch();
        pages.benuVaistine.FindPharmacy.enterCitySearch();
        pages.benuVaistine.FindPharmacy.searchCityFromList();
        pages.benuVaistine.FindPharmacy.checkBox();
        pages.benuVaistine.FindPharmacy.clickOnResult();

    }
}
