package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_YahooTitleVerification {

    public static void main(String[] args) {

        /*
        TC #1: Yahoo Title Verification
        1. Open Chrome browser
        2. Go to https://www.yahoo.com
        3. Verify title (expected: Yahoo)
         */

        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver driver = new ChromeDriver();

        //make our page fullscreen
        driver.manage().window().maximize();

        //go to yahoo.com
        driver.get("https://www.yahoo.com");

        //verify the title
        String exptectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(exptectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }






    }


}
