package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6_FaceBookHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        //short - cut for auto-generating


        // 3. verify header text as expected

        WebElement header = driver.findElement(By.className("_8eso"));

        // Expected header: "Connect with friends and the world around you on Facebook."
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if(actualHeader.equals(expectedHeader)) {
            System.out.println("Header Verification PASSED");
        } else {
            System.out.println("Header Verification FAILED");
        }


    }
}
