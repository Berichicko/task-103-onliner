import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public final By SECTION_CATALOG_LOCATOR = By.xpath("//a[contains(text(), 'Каталог')][1]");
    public final By SECTION_ELECTRON_LOCATOR = By.xpath("//span[contains(text(), 'Электроника')] ");
    public final By SECTION_TV_LOCATOR = By.xpath("//*[text()=\"Телевизоры\"]");
    public final By CHECKBOX_LG_LOCATOR = By.xpath("//span[contains(text(), 'LG')] ");
    public final By FILTER_TV_LOCATOR = By.xpath("//span[@data-bind='html: tag.text']");
    private final String NAME_TV_MODEL ="Samsung";

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public boolean resultNegativeSamsung() {
        return driver.findElement(FILTER_TV_LOCATOR).getText().equals(NAME_TV_MODEL);
    }
}
