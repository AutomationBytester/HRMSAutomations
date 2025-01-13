package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class allEmployeePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement employeeSideBarButton;

    @FindBy(xpath = "//*[@id=\"employee\"]/ul/li[1]/a")
    private WebElement allEmployeeButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/button")
    private WebElement listButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/button[1]")
    private WebElement addEmployeeButton;

    public allEmployeePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void allEmployee() throws InterruptedException {

        Thread.sleep(2000);
        employeeSideBarButton.click();

        waitWebElement(allEmployeeButton, driverTwo);
        allEmployeeButton.click();

        Assert.assertEquals(pageHeading.getText(), "All Employees", "Page heading does not match!");

        waitWebElement(listButton, driverTwo);
        listButton.click();

        waitWebElement(addEmployeeButton, driverTwo);
        addEmployeeButton.click();

        Thread.sleep(3000);

    }

}
