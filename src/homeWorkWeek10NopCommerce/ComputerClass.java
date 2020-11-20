package homeWorkWeek10NopCommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputerClass extends BaseNopCom {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openMyBrowser(baseUrl);
    }
    @After
    public void closeBrowser() {
        closeMyBrowser();
    }
    @Test
    public void testComputerLink() throws InterruptedException {

        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
        Thread.sleep(2000);

        String expectedMessage = "Computers";
        String actualMessage= getTextFromElements(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void abc () throws InterruptedException {
        testComputerLink();

        clickOnElement(By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]"));
        Thread.sleep(2000);

        String expectedText = getTextFromElements(By.xpath("//h1[contains(text(),'Desktops')]"));
        String actualText = "Desktops";
        Assert.assertEquals(actualText, expectedText);


    }


}

