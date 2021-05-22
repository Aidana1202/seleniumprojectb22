package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_FaceBookIncorrectLogTitVeri {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: FaceBook Title Verification
        // 1. Open Chrome Browser
        // Setup browser driver
        WebDriverManager.chromedriver().setup();

        // create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        // 2 . Go to "https://www.facebook.com"
        driver.get("https://www.facebook.com");

        //Locating the web element using id locator and storing it in WebElement type.
        WebElement inputUserName = driver.findElement(By.id("email"));

        // 3 .Enter incorrect username
        inputUserName.sendKeys("something123@gmail.com");

        //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("pass"));

         // 4. Enter incorrect password
        inputPassword.sendKeys("1234_Dana" , Keys.ENTER);

        // Verify Title change to:
        // Expected: "Log into Facebook"
        String expectedTitle = "Log into Facebook";

        Thread.sleep(5000);

        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("Title Verification is PASSED");
        } else{
            System.out.println("Title Verification is FAILED");
        }





    }
}
