package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        //do NOT use any developer tool to get any locators
        //TC#1: xpath and cssSelector practices
        //1. Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        //2. Go to: https://practice.cydeo.com/forgot_password

        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using xpath and/or css locator only
            //a. "Home" link

        //locate homeLink using cssSelector, class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locate homeLink using cssSelector syntax#2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //locate homeLink using cssSelector, href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("homeLink_ex2.isDisplayed() = " + homeLink_ex2.isDisplayed());
        System.out.println("homeLink_ex3.isDisplayed() = " + homeLink_ex3.isDisplayed());


        //b. "Forgot password" header

        //locate header using cssSelector, locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        //locate header using xpath
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("header_ex2.isDisplayed() = " + header_ex2.isDisplayed());

        //c. "Email" text

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        //d. Email input box

        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //locate inputBox using xpath contains method
        //tagName[contains(@attribute,'value')]
        //WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@patterns,'a-z')]"));

        //System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        //System.out.println("inputBox_ex2.isDisplayed() = " + inputBox_ex2.isDisplayed());

        //e. "Retrieve password" button

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrievePasswordButton_ex2 = driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement retrievePasswordButton_ex3 = driver.findElement(By.xpath("//button[@type='submit']"));

            //f. "Powered by Cydeo" text

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

       System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
       System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

    }



}
