package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open a Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to : https://practice.cydeo.com/javascript_alerts

        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_test1(){
        //3. Click to the "Click for JS Alert" button

        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //4. Click to OK button from the alert
        //To be able to click to Alert OK button, we need to switch driver's focus to Alert itself

        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify "You successfully clicked an alert" text is displayed.

        WebElement confirmationText = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));
        //Failure message will only be displayed if assertion fails.
        Assert.assertTrue(confirmationText.isDisplayed(), "Result text is NOT displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = confirmationText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result is not as expected!!");
    }




}
