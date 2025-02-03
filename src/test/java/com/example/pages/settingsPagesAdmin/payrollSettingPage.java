package com.example.pages.settingsPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class payrollSettingPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[11]/a")
    private WebElement settingButton;

    @FindBy(xpath = "//*[@id=\"settings\"]/ul/li[4]/a")
    private WebElement payrollSettingButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(id = "v-pills-Badge Value-tab")
    private WebElement badgeValueTab;

    @FindBy(tagName = "h5")
    WebElement badgeValueHeading;

    @FindBy(id = "v-pills-Manage audience-tab")
    private WebElement manageAudienceTab;

    @FindBy(tagName = "h5")
    WebElement manageAudienceHeading;

    @FindBy(id = "v-pills-Payslip-tab")
    private WebElement payslipTab;

    @FindBy(tagName = "h5")
    WebElement payslipHeading;

    public payrollSettingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void payrollSetting() throws InterruptedException {

        Thread.sleep(2000);
        settingButton.click();

        waitWebElement(payrollSettingButton, driverTwo);
        payrollSettingButton.click();
        Assert.assertEquals(pageHeading.getText(), "Payroll Settings", "Page heading does not match!");

        waitWebElement(badgeValueTab, driverTwo);
        badgeValueTab.click();
        Assert.assertEquals(badgeValueHeading.getText(), "Badge Value", "Page heading does not match!");

        waitWebElement(manageAudienceTab, driverTwo);
        manageAudienceTab.click();
        Assert.assertEquals(manageAudienceHeading.getText(), "Manage Audience", "Page heading does not match!");

        waitWebElement(payslipTab, driverTwo);
        payslipTab.click();
        Assert.assertEquals(payslipHeading.getText(), "Payslip", "Page heading does not match!");


        Thread.sleep(3000);

    }

}
