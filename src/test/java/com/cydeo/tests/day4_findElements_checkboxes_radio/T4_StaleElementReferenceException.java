package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_StaleElementReferenceException {

    public static void main(String[] args) {

        //TC#6 : StaleElementReferenceException Task
        //1. Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        //2. Go to : https://practice.cydeo.com/abtest

        driver.get("https://practice.cydeo.com/abtest");

        //3. Locate "Cydeo" link, verify it is displayed.

        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4. Refresh the page

        driver.navigate().refresh();

        //5. Verify it is displayed again
        //we are refreshing the web element reference by re-assigning (re-locating) the web element
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


    }

}
