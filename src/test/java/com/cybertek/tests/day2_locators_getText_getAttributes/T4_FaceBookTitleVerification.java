package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_FaceBookTitleVerification {
    public static void main(String[] args) {

        //TC #1: FaceBook Title Verification
        // 1. Open Chrome Browser
        // Setup browser driver
        WebDriverManager.chromedriver().setup();

        // create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        // 3. Verify Title :
        // Expected : "Facebook - Log In or Sign Up"
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("Title Verification is PASSED");
        } else{
            System.out.println("Title Verification is FAILED");
        }

    }
}
