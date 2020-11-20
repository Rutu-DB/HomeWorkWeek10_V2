package homeWorkWeek10NopCommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DigitalDownloads extends BaseNopCom {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openMyBrowser(baseUrl);
    }
    @After
    public void closeSetUp(){
        closeMyBrowser();
    }

    @Test
    public void setDigitalDownloadLink(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']"));

        String actualResult = getTextFromElements(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String expectedResult = "Digital downloads";

    }


}
