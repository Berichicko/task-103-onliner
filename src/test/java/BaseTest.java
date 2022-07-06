import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private final static String URL_CONNECTION = "https://www.onliner.by/";
    HomePage homePage;
    private WebDriver driver;

    @Before
    public void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_CONNECTION);
        homePage = new HomePage(driver);
    }

    @After
    public void closeConnection() {
        try {
            Thread.sleep(3000); //?
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
