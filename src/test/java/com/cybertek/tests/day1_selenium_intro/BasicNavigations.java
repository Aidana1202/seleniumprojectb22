package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1 - setup the browser driver
        WebDriverManager.chromedriver().setup();

        // 2 - create instance of selenium web driver
        // this line opens a browser
        WebDriver driver = new ChromeDriver();

        // maximize the current window
        driver.manage().window().maximize();

        //will work for mac only
        driver.manage().window().fullscreen();

        // 3 - get the page
        driver.get("https://www.tesla.com");

        System.out.println("Current title: " + driver.getTitle());
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //putting 3 sec of wait / stops the code for 3 sec
        Thread.sleep(1000);

        //Going back using navigations
        driver.navigate().back();

        //Going forward using navigations
        driver.navigate().forward();

        //putting 3 sec of wait / stops the code for 3 sec
        Thread.sleep(1000);

        //refreshing the page using navigations
        driver.navigate().refresh();

        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");
        System.out.println("Current title: " + driver.getTitle());
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this method will close the currently opened browser
        //it will close only 1 browser or 1 tab
        driver.close();

        //will close all of the opened browsers or tabs within the same session
        //will kill the current session completely
        driver.quit();














    }
}
