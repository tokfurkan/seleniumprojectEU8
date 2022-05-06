package com.cydeo.tests.day2_locators_getTask_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {

        //TC#3: Back and Forth Navigation
        //1. Open a Chrome Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to: https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");

        //3. Click to A/B Testing from top of the list

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //4. Verify title is: No A/B Test

        String actualTitle = driver.getTitle();
        String expectedTitle = "No A/B Test";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

        //5. Go back to home page by using .back();

        driver.navigate().back();

        //6. Verify title equals: Practice

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification failed");
        }

    }
}
