package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(3000);
        //
        driver.findElement(By.className("nav-link")).click();
        //
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }


    }
}
