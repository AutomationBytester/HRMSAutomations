package com.example.pages.employeesPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class employmentStatusPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement employeeSideBarButton;

    @FindBy(xpath = "//*[@id=\"employee\"]/ul/li[3]/a")
    private WebElement employmentStatusButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/button")
    private WebElement addEmploymentStatusButton;

    @FindBy(id = "formData.name")
    private WebElement nameEmploymentStatus;

    @FindBy(id = "formData.class")
    private WebElement colourValueButton;

    @FindBy(xpath = "//*[@id=\"formData.class\"]/option[2]")
    private WebElement purpleColour;

    @FindBy(id = "formData.description")
    private WebElement descriptionEnter;

    @FindBy(xpath = "//*[@id=\"employment-status-modal\"]/div/div/div[3]/button[2]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"employment-status-modal\"]/div/div/div[3]/button[1]")
    private WebElement cancelButton;


    public employmentStatusPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void employmentStatus() throws InterruptedException {

        Thread.sleep(2000);
        employeeSideBarButton.click();

        waitWebElement(employmentStatusButton, driverTwo);
        employmentStatusButton.click();
        Assert.assertEquals(pageHeading.getText(), "Employment Status", "Page heading does not match!");

        waitWebElement(addEmploymentStatusButton, driverTwo);
        addEmploymentStatusButton.click();

        waitWebElement(nameEmploymentStatus, driverTwo);
        nameEmploymentStatus.sendKeys("only for testing");

        waitWebElement(colourValueButton, driverTwo);
        colourValueButton.click();

        waitWebElement(purpleColour, driverTwo);
        Select select = new Select(colourValueButton);
        select.selectByValue("purple");
        purpleColour.click();

        waitWebElement(descriptionEnter, driverTwo);
        descriptionEnter.sendKeys("only using for testing");

        waitWebElement(colourValueButton, driverTwo);
        colourValueButton.click();

        waitWebElement(purpleColour, driverTwo);
        Select select2 = new Select(colourValueButton);
        select2.selectByValue("purple");

        waitWebElement(saveButton, driverTwo);
        saveButton.click();

        Thread.sleep(3000);

    }

}
