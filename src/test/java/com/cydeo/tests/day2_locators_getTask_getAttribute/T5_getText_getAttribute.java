package com.cydeo.tests.day2_locators_getTask_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        //TC#5: getText() and getAttribute method practice
        //1. Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        //2. Go to: https://practice.cydeo.com/registration_form

        driver.get("https://practice.cydeo.com/registration_form");

        //3. Verify header text is expected: Registration Form

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText(); //will return "registration form" as String

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header test verification passed!");
        } else {
            System.out.println("Header test verification failed!");
        }

        //4. Locate "First name" input box
        //we are locating the web element using the "name" locator
        //name attribute has "firstname" value

        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //5. Verify placeholder attribute's value is expected: first name

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification passed");
        } else {
            System.out.println("Placeholder text verification failed!");
        }

        driver.close();



    }


}
