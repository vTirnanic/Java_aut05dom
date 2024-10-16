package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisElementsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void userCanLoadHomePageThroughHomeButton() {
        homePage.clickOnDisElements();
        disElPage.clickOnHomeButton();
        Assert.assertTrue(homePage.getDisElements().isDisplayed());
    }

    @Test
    public void userCannotLoadAboutPage() {
        homePage.clickOnDisElements();
        disElPage.clickOnAboutButton();
        String textOnPage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(textOnPage, "Not Found");
    }

    @Test
    public void userCannotLoadContactusPage() {
        homePage.clickOnDisElements();
        disElPage.clickOnContactUsButton();
        String textOnPage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(textOnPage, "Not Found");
    }
}
