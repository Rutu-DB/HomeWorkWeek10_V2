package homeWorkWeek10NopCommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class BooksLinkClass extends BaseNopCom {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openMyBrowser(baseUrl);
    }

    @After
    public void closeSetUp() {
        closeMyBrowser();
    }

    @Test
    public void booksMethod() {

        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']"));

        String expectedResult = "Books";
        String actualResult = getTextFromElements(By.xpath("//h1[contains(text(),'Books')]"));
        Assert.assertEquals(actualResult, expectedResult);
    }
}
