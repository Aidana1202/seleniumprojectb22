package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T7_FaceBookAttributteVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement createPageLink = driver.findElement(By.className("_8esh"));
        String expectedInHref = "registration_form";

        String actualHrefValue = createPageLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)) {
            System.out.println("Attribute Verification PASSED");
        } else {
            System.out.println("Attribute Verification FAILED");
        }




    }

}
