package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisElPage {

    WebDriver driver;

    WebElement homeButton;
    WebElement aboutButton;
    WebElement contactUsButton;

    public DisElPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeButton() {
        return driver.findElement(By.linkText("Home"));
    }

    public void clickOnHomeButton() {
        getHomeButton().click();
    }

    public WebElement getAboutButton() {
        return driver.findElement(By.linkText("About"));
    }

    public void clickOnAboutButton() {
        getAboutButton().click();
    }

    public WebElement getContactUsButton() {
        return driver.findElement(By.linkText("Contact Us"));
    }

    public void clickOnContactUsButton() {
        getContactUsButton().click();
    }
}
