package homeWorkWeek10NopCommerce;

import Utility.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Apparel extends BaseNopCom {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openMyBrowser(baseUrl);
    }

    @After
    public void setupClose() {
        closeMyBrowser();
    }

    @Test
    public void apparelMethod() throws InterruptedException {

        clickOnElement(By.xpath("//div/ul[@class= 'top-menu notmobile']//a[contains(text(),'Apparel')]"));
        Thread.sleep(2000);

        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElements(By.xpath("//h1[contains(text(),'Apparel')]"));

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void shoeMethod() throws InterruptedException {
        apparelMethod();
        clickOnElement(By.xpath("//div/h2[@class='title']//a[@href='/shoes']"));
        Thread.sleep(2000);

        String expectedResult = "Shoes";
        String actualResult = getTextFromElements(By.xpath("//h1[contains(text(),'Shoes')]"));

        Assert.assertEquals(actualResult, expectedResult);
    }
}
