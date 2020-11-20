package homeWorkWeek10NopCommerce;

import Utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseNopCom extends Utility {
    //instance variable declared for WebElement
//    public WebDriver driver;

    public void openMyBrowser(String baseUrl) {
//setting up chrome driver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }


    public void closeMyBrowser() {
        //  driver.quit();
    }


}
