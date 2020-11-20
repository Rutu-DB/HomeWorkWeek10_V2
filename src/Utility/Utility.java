package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {

    public WebDriver driver;

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void sendTextToElements(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElements(By by) {
        return driver.findElement(by).getText();
    }
}
