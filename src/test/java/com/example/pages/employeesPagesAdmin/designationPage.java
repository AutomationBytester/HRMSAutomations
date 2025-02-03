package com.example.pages.employeesPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class designationPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement employeeSideBarButton;

    @FindBy(xpath = "//*[@id=\"employee\"]/ul/li[2]/a")
    private WebElement designationButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/button")
    private WebElement addDesignationButton;

    @FindBy(id = "formData.name")
    private WebElement designationName;

    @FindBy(id = "formData.description")
    private WebElement descriptionButton;

    @FindBy(xpath = "//*[@id=\"designation-modal\"]/div/div/div[3]/button[2]/span")
    private WebElement saveButton;

    public designationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }
    public void designation() throws InterruptedException {

        Thread.sleep(2000);
        employeeSideBarButton.click();

        waitWebElement(designationButton, driverTwo);
        designationButton.click();
        Assert.assertEquals(pageHeading.getText(), "Designation", "Page heading does not match!");

        waitWebElement(addDesignationButton, driverTwo);
        addDesignationButton.click();

        waitWebElement(designationName, driverTwo);
        designationName.sendKeys("Only For The Test");

        waitWebElement(descriptionButton, driverTwo);
        descriptionButton.sendKeys("Only using for test");

        waitWebElement(saveButton, driverTwo);
        saveButton.click();

        Thread.sleep(3000);

    }
}
