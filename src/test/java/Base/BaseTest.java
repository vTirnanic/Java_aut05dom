package Base;

import Pages.DisElPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/*
Domaci:
Na sledecem sajtu izabrati 3 case-a koja cete uraditi, tako sto cete koirstiti POM
https://the-internet.herokuapp.com/
 */
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public HomePage homePage;
    public DisElPage disElPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage(driver);
        disElPage = new DisElPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
