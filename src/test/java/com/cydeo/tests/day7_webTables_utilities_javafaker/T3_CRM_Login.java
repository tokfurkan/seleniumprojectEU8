package com.cydeo.tests.day7_webTables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_Login {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test(){
        //TC #3 : Login scenario
        //1. Create new test and make setups
        //2. Go to : https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");


        //5. CLick to log in button

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


        //6. Verify title is as expected. Expected title is : Portal

        BrowserUtils.verifyTitle(driver, "Portal");
    }



}
