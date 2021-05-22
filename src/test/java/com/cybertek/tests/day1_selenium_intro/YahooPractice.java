package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {
        //TC#1: Yahoo Title Verification
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Maximize browser window
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        //3. Go to "https://www.yahoo.com"
        driver.get("https://www.yahoo.com");

        //4.Verify title
        //Expected title: Yahoo
        String expectedTitle = "Yahoo";

        //Actual title:
        String actualTitle = driver.getTitle();

        //Creating our verification
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!!");
        }

        //CLosing the browser
        driver.close();

    }
}
