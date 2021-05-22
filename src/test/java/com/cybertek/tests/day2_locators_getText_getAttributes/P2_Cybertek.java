package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_Cybertek {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");


        // 3.Verify URL contains
        // Expected:"cybertekschool"
        String expectedInURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInURL)) {
            System.out.println("URL verification PASSED");
        } else {
            System.out.println("URL verification FAILED");
        }


        // 4. Verify title:
        // Expected : "Practice"
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else{
            System.out.println("Title verification FAILED");
        }

    }
}
