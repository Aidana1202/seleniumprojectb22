package com.cybertek.tests.vytrack;

import com.cybertek.pages.VyTrackLoginPage;
import com.cybertek.pages.VyTrackVehiclePage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC_B226_167 {

    @Test
    public void TC_B226_167() throws InterruptedException {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

        VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        vyTrackLoginPage.inputEmail.sendKeys("User174");
        vyTrackLoginPage.inputPassword.sendKeys("UserUser123");
        vyTrackLoginPage.signInBtn.click();

        VyTrackVehiclePage vyTrackVehiclePage = new VyTrackVehiclePage();
        vyTrackVehiclePage.fleetBtn.click();
        vyTrackVehiclePage.vehicleBtn.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vyTrackVehiclePage.gridSettingBtn).perform();
        Assert.assertTrue(vyTrackVehiclePage.gridSettingBtn.isDisplayed());
        Thread.sleep(4000);

    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }


}
