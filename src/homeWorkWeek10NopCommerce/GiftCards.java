package homeWorkWeek10NopCommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GiftCards extends BaseNopCom {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openMyBrowser(baseUrl);
    }
    @After
    public void closeSetUp(){
        closeMyBrowser();
    }
    @Test
    public void giftCardMessage() throws InterruptedException {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']"));
        Thread.sleep(2000);

        String actualResult = getTextFromElements(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String expectedResult = "Gift Cards";

        Assert.assertEquals(actualResult,expectedResult);
    }

}
