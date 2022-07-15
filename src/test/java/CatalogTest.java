import org.junit.Assert;
import org.junit.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void SamsungTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.SECTION_CATALOG_LOCATOR);
        homePage.clickElement(homePage.SECTION_ELECTRON_LOCATOR);
        homePage.clickElement(homePage.SECTION_TV_LOCATOR);
        homePage.clickElement(homePage.CHECKBOX_LG_LOCATOR);
        Assert.assertFalse(homePage.resultNegativeSamsung());
    }
}
