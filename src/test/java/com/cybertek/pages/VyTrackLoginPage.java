package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement signInBtn;




}
