package com.example.pages.settingsPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class leaveSettingsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[11]/a")
    private WebElement settingButton;

    @FindBy(xpath = "//*[@id=\"settings\"]/ul/li[2]/a")
    private WebElement leaveSettingButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"Leave Type-0\"]/div[1]/div/button")
    private WebElement addLeaveButton;

    @FindBy(id = "formData.name")
    private WebElement nameInput;

    @FindBy(id = "formData.type")
    private WebElement typeDropdown;

    @FindBy(xpath = "//*[@id=\"formData.type\"]/option[2]")
    private WebElement optionSelect;

    @FindBy(id = "formData.amount")
    private WebElement amountInput;

    @FindBy(xpath = "//*[@id=\"leave-type-modal\"]/div/div/div[2]/form/div[4]/div[1]/div/div/label[1]/span")
    private WebElement enabledButton;

    @FindBy(xpath = "//*[@id=\"leave-type-modal\"]/div/div/div[2]/form/div[4]/div[1]/div/div/label[2]/span")
    private WebElement enabledNoButton;

    @FindBy(xpath = "//*[@id=\"leave-type-modal\"]/div/div/div[2]/form/div[4]/div[2]/div/div/label[1]/span")
    private WebElement allowMonthlyButton;

    @FindBy(xpath = "//*[@id=\"leave-type-modal\"]/div/div/div[2]/form/div[4]/div[2]/div/div/label[2]/span")
    private WebElement allowMonthlyNoButton;

    @FindBy(xpath = "//*[@id=\"leave-type-modal\"]/div/div/div[3]/button[1]")
    private WebElement cancelButton;

    @FindBy(xpath = "//*[@id=\"leave-type-modal\"]/div/div/div[3]/button[2]")
    private WebElement saveButton;

    @FindBy(id = "v-pills-Allowance Policy-tab")
    private WebElement allowancePolicyTab;

    @FindBy(id = "v-pills-approval-tab")
    private WebElement approvalTab;


    public leaveSettingsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void leaveSettings() throws InterruptedException {

        Thread.sleep(2000);
        settingButton.click();

        waitWebElement(leaveSettingButton, driverTwo);
        leaveSettingButton.click();
        Assert.assertEquals(pageHeading.getText(), "Leave Settings", "Page heading does not match!");

        waitWebElement(addLeaveButton, driverTwo);
        addLeaveButton.click();

        waitWebElement(nameInput, driverTwo);
        nameInput.sendKeys("Hello for testing");

        waitWebElement(typeDropdown, driverTwo);
        typeDropdown.click();
        optionSelect.click();
        optionSelect.isSelected();
//        waitWebElement(optionSelect,driverTwo);
//        Select select = new Select(optionSelect);
//        select.selectByVisibleText("Option 1");
//        Actions actions = new Actions(driver);
//        actions.moveToElement(typeDropdown).click().build().perform();
//        // Click the option to select it
//        actions.moveToElement(optionSelect).click().build().perform();

        waitWebElement(amountInput, driverTwo);
        amountInput.sendKeys("10100");

        waitWebElement(enabledNoButton, driverTwo);
        enabledNoButton.click();

        waitWebElement(enabledButton, driverTwo);
        enabledButton.click();

        waitWebElement(allowMonthlyNoButton, driverTwo);
        allowMonthlyNoButton.click();

        waitWebElement(allowMonthlyButton, driverTwo);
        allowMonthlyButton.click();

        waitWebElement(cancelButton, driverTwo);
        cancelButton.click();

        waitWebElement(allowancePolicyTab, driverTwo);
        allowancePolicyTab.click();

        waitWebElement(approvalTab, driverTwo);
        approvalTab.click();

        Thread.sleep(3000);

    }

}
