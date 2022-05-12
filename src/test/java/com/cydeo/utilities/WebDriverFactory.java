package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //Task: New Method Creation
    //Method name: getDriver
    //Static Method
    //Accepts String arg: browserType
    //      - This argument will determine what type of browser is opened
    //      - if "chrome" is passed --> it will open chrome browser
    //      - if "firefox" is passed --> it will open firefox browser
    //Return type: "WebDriver"

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else {
            System.out.println("Given browser type does not exist or is not currently supported");
            return null;
        }


    }

}
