package com.example.pages.settingsPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class importPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[11]/a")
    private WebElement settingButton;

    @FindBy(xpath = "//*[@id=\"settings\"]/ul/li[5]/a")
    private WebElement importButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(tagName = "h5")
    WebElement importEmployeesHeading;

    @FindBy(id = "v-pills-Attendance-tab")
    private WebElement attendanceTab;

    @FindBy(tagName = "h5")
    WebElement attendanceHeading;

    public importPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void Import() throws InterruptedException {
        Thread.sleep(2000);
        settingButton.click();

        waitWebElement(importButton, driverTwo);
        importButton.click();
        Assert.assertEquals(pageHeading.getText(), "Import", "Page heading does not match!");
        Assert.assertEquals(importEmployeesHeading.getText(), "Import Employees", "Page heading does not match!");

        waitWebElement(attendanceTab, driverTwo);
        attendanceTab.click();
        Assert.assertEquals(attendanceHeading.getText(), "Import Attendance", "Page heading does not match!");


        Thread.sleep(3000);

    }
}
