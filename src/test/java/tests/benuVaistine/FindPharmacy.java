package tests.benuVaistine;

import org.testng.Assert;
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
    public void testingPharmacySearch() {
        String expectedSearchResult = "Žirmūnų g. 64, Hyper RIMI";
        String actualSearchResult;

        pages.benuVaistine.FindPharmacy.enterPharmacySearch();
        pages.benuVaistine.FindPharmacy.enterCitySearch();
        pages.benuVaistine.FindPharmacy.searchCityFromList();
        pages.benuVaistine.FindPharmacy.checkBox();
        pages.benuVaistine.FindPharmacy.clickOnResult();
        actualSearchResult = pages.benuVaistine.FindPharmacy.readPharmacySearchResult();

        Assert.assertTrue(actualSearchResult.contains(expectedSearchResult));
    }
}
