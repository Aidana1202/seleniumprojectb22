package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //
        driver.get("http://zero.webappsecurity.com/login.html");
        //
        String expectedHeader = "Log in to ZeroBank";

        WebElement actualHeader = driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();


        if(actualHeaderText.equals(expectedHeader)) {
            System.out.println("Header verification PASSED");
        } else {
            System.out.println("Header verification FAILED");
        }


    }
}
