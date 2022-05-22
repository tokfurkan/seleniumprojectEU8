package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    //1. Open a Chrome browser
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to : https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dropdown_task5(){

        //TC #5 : Selecting state from State dropdown and verifying result

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

    @Test
    public void dropdown_task6(){

        //TC #6 : Selecting date on dropdown and verifying
        // Select "December 1 , 1923" and verify it is selected

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using visible text

        yearDropdown.selectByVisibleText("1923");

        //Select month using value attribute

        monthDropdown.selectByValue("11");

        //Select day using index number

        dayDropdown.selectByIndex(0);

        String expectedYear = "1923";
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedYear, actualYear);

        String expectedMonth = "December";
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedMonth, actualMonth);

        String expectedDay = "1";
        String actualDay = dayDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDay, actualDay);


    }



}
