package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    WebElement disElements;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDisElements() {
        return driver.findElement(By.linkText("Disappearing Elements"));
    }

    public void clickOnDisElements() {
        getDisElements().click();
    }
}
