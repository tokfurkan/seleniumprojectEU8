package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open a Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to : "https://practice.cydeo.com/iframe"

        driver.get("https://practice.cydeo.com/iframe");

    }

    //@Ignore
    @Test
    public void iframe_test(){

        //We need to switch driver's focus to iframe
        //Option #1 : swtiching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //Option #2 : passing index number of iframe
        driver.switchTo().frame(0);

        //Option #3 : locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the p tag
        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed.
        //To be able to verify the header, we myst switch back to "main HTML"

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
