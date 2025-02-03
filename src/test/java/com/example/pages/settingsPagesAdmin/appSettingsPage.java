package com.example.pages.settingsPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class appSettingsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[11]/a")
    private WebElement settingButton;

    @FindBy(xpath = "//*[@id=\"settings\"]/ul/li[1]/a")
    private WebElement appSettingButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(id = "v-pills-modules-tab")
    private WebElement modulesTabButton;

    @FindBy(tagName = "h5")
    WebElement moduleHeading;

    @FindBy(id = "v-pills-Cron Job-tab")
    private WebElement cronJobTabButton;

    @FindBy(tagName = "h5")
    WebElement cronJobHeading;

    @FindBy(id = "v-pills-Email setup-tab")
    private WebElement emailSetupTabButton;

    @FindBy(tagName = "h5")
    WebElement emailSetupHeading;

    @FindBy(id = "v-pills-Notification-tab")
    private WebElement notificationTabButton;

    @FindBy(tagName = "h5")
    WebElement notificationHeading;

    @FindBy(id = "v-pills-Update-tab")
    private WebElement updateTabButton;

    @FindBy(tagName = "h5")
    WebElement updateHeading;

    @FindBy(id = "v-pills-general-tab")
    private WebElement generalTabButton;

    @FindBy(tagName = "h5")
    WebElement generalHeading;


    public appSettingsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }
    public void appSetting() throws InterruptedException {

        Thread.sleep(2000);
       settingButton.click();

        waitWebElement(appSettingButton, driverTwo);
        appSettingButton.click();
        Assert.assertEquals(pageHeading.getText(), "App Settings", "Page heading does not match!");

        waitWebElement(modulesTabButton, driverTwo);
        modulesTabButton.click();
        Assert.assertEquals(moduleHeading.getText(), "Modules", "Page heading does not match!");

        waitWebElement(cronJobTabButton, driverTwo);
        cronJobTabButton.click();
        Assert.assertEquals(cronJobHeading.getText(), "Cron Job", "Page heading does not match!");

        waitWebElement(emailSetupTabButton, driverTwo);
        emailSetupTabButton.click();
        Assert.assertEquals(emailSetupHeading.getText(), "Email Setup", "Page heading does not match!");

        waitWebElement(notificationTabButton, driverTwo);
        notificationTabButton.click();
        Assert.assertEquals(notificationHeading.getText(), "Notification", "Page heading does not match!");

        waitWebElement(updateTabButton, driverTwo);
        updateTabButton.click();
        Assert.assertEquals(updateHeading.getText(), "Update", "Page heading does not match!");

        waitWebElement(generalTabButton, driverTwo);
        generalTabButton.click();
        Assert.assertEquals(generalHeading.getText(), "General", "Page heading does not match!");

        Thread.sleep(3000);
    }
}
