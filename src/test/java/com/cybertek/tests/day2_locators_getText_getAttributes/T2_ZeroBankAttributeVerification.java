package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //
        driver.get("http://zero.webappsecurity.com/login.html");

        //Locate the lin web element and store inside of web element
        WebElement zeroBankLink = driver.findElement(By.className("brand"));


        //

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if(actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link Text verification PASSED");
        } else {
            System.out.println("Link Text verification FAILED");
        }

        //
        String expectedInAttributeValue = "index.html";
        String expectedInHrefValue = "index.html";





    }
}
