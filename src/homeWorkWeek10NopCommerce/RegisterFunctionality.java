package homeWorkWeek10NopCommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterFunctionality extends BaseNopCom {

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
    public void registerFunctionalityUsingMandatoryFields() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        clickOnElement(By.xpath("//label[contains(text(),'Male')]"));

        clickOnElement(By.xpath("//input[@id='gender-female']"));

        Thread.sleep(1000);

        clickOnElement(By.xpath("//input[@id='FirstName']"));
        sendTextToElements(By.xpath("//input[@id='FirstName']"), "Alpha");

        clickOnElement(By.xpath("//input[@id='LastName']"));
        sendTextToElements(By.xpath("//input[@id='LastName']"), "Beta");

        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']//option[contains(text(),'11')]"));

        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']//option[contains(text(),'November')]"));

        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']//option[contains(text(),'2011')]"));

        clickOnElement(By.xpath("//input[@id='Email']"));

        //Inbuilt Random method called and String concatinated to take auto generated email id
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElements(By.xpath("//input[@id='Email']"), +randomInt + "@gmail.com");

        clickOnElement(By.xpath("//input[@id='Company']"));
        sendTextToElements(By.xpath("//input[@id='Company']"), "Abc Ltd.");

        clickOnElement(By.xpath("//input[@id='Newsletter']"));

        clickOnElement(By.xpath("//input[@id='Password']"));
        sendTextToElements(By.xpath("//input[@id='Password']"), "123456");

        clickOnElement(By.xpath("//input[@id='ConfirmPassword']"));
        sendTextToElements(By.xpath("//input[@id='ConfirmPassword']"), "123456");

        clickOnElement(By.xpath("//input[@id='register-button']"));

        String actualMessage = getTextFromElements(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String expectedMessage = "Your registration completed";

        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
