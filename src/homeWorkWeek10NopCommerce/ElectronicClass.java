package homeWorkWeek10NopCommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ElectronicClass extends BaseNopCom {
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
    public void electronicLink() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
        String actualResult = getTextFromElements(By.xpath("//h1[contains(text(),'Electronics')]"));
        String expectedResult = "Electronics";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void cameraPhoto() throws InterruptedException {
        electronicLink();
        Thread.sleep(2000);
        clickOnElement(By.xpath("//div[@class = 'sub-category-item']//a[contains(text(),'Camera & photo')]"));
        Thread.sleep(500);
        String expectedResult = "Camera & photo";
        String actualResult = getTextFromElements(By.xpath("//h1[contains(text(),'Camera & photo')]"));
        Assert.assertEquals(actualResult, expectedResult);
    }


}
