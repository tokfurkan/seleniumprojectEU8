package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        //TC#4 : NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to : https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify "Reset password" button text is as expected: Reset password

        //tagName[attribute='value']
        //locating reset password button using class attribute and its value
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset password button using value attribute and its value
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"))

        String expectedResetButtonText = "Reset password";
        String actualResetButtonText = resetPasswordButton.getText();

        if (actualResetButtonText.equals(expectedResetButtonText)){
            System.out.println("Reset button text verification passed!");
        } else {
            System.out.println("Reset button text verification failed!");
        }


    }

}
