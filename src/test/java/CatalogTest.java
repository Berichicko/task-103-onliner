import org.junit.Assert;
import org.junit.Test;
public class CatalogTest extends BaseTest {

    @Test
    public void SamsungTest() {
        homePage.clickCatalog();
        homePage.clickElectron();
        homePage.clickTV();
        homePage.clickLG();
        Assert.assertFalse(homePage.resultNegativeSamsung());
    }
}
