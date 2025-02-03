package com.example.pages.settingsPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class attendanceSettingPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[11]/a")
    private WebElement settingButton;

    @FindBy(xpath = "//*[@id=\"settings\"]/ul/li[3]/a")
    private WebElement attendanceSettingButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(id = "v-pills-Definitions-tab")
    private WebElement definitionsTab;

    @FindBy(tagName = "h5")
    WebElement definitionsHeading;

    @FindBy(id = "v-pills-Geolocation & IP-tab")
    private WebElement geolocationIPTab;

    @FindBy(tagName = "h5")
    WebElement geolocationIPTabHeading;

    @FindBy(id = "v-pills-IP Restriction-tab")
    private WebElement iPRestrictionTab;

    @FindBy(tagName = "h5")
    WebElement iPRestrictionHeading;


    public attendanceSettingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void attendanceSetting() throws InterruptedException {

        Thread.sleep(2000);
        settingButton.click();

        waitWebElement(attendanceSettingButton, driverTwo);
        attendanceSettingButton.click();
        Assert.assertEquals(pageHeading.getText(), "Attendance Settings", "Page heading does not match!");

        waitWebElement(definitionsTab, driverTwo);
        definitionsTab.click();
        Assert.assertEquals(definitionsHeading.getText(), "Definitions", "Page heading does not match!");

        waitWebElement(geolocationIPTab, driverTwo);
        geolocationIPTab.click();
        Assert.assertEquals(geolocationIPTabHeading.getText(), "Geolocation & IP", "Page heading does not match!");

        waitWebElement(iPRestrictionTab, driverTwo);
        iPRestrictionTab.click();
        Assert.assertEquals(iPRestrictionHeading.getText(), "IP Restriction", "Page heading does not match!");


        Thread.sleep(3000);

    }
}
