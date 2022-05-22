package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {


    @Test
    public void dropdown_task5(){

        //TC #5 : Selectibg state from State dropdown and verifying result
        //1. Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to : https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select Illinois

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");


        //4. Select Virginia

        stateDropdown.selectByValue("VA");

        //5. Select California

        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.

        String expectedOptionText = "California";

        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);

        //Use all Select options (visible text, value, index)







    }



}
