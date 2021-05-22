package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        //// method from utilities WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("Title Verification is PASSED");
        } else {
            System.out.println("Title Verification is FAILED");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(("test") , Keys.ENTER);

        //driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expectedT2 = "Web Orders";
        String actualT2 = driver.getTitle();

        if(actualT2.equals(expectedT2)) {
            System.out.println("Login Title Verification is PASSED");
        } else {
            System.out.println("Login Title Verification is FAILED");
        }






    }
}
