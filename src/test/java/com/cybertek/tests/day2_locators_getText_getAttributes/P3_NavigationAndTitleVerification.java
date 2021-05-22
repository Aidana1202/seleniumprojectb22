package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to "https://google.com":
        driver.get("https://google.com");

        // 3. Click to Gmail from top right
        driver.findElement(By.linkText("Gmail")).click();
        // 4. Verify title contains
        // Expected gmail
        String  expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification Failed");
        }

        // 5. Go back to Google by using the .back();
        driver.navigate().back();

        // 6.Verify title equals:
        //Expected: "Google"
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equalsIgnoreCase(expectedGoogleTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }


        }
    }
