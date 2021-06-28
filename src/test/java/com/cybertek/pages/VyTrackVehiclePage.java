package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackVehiclePage {
    public VyTrackVehiclePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[@class='title title-level-2']")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement isDisp;
}
