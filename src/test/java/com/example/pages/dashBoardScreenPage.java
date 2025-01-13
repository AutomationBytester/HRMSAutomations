package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class dashBoardScreenPage extends BasePage{

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/button")
    private WebElement punchInButton;

    @FindBy(xpath = "//*[@id=\"punch-in-modal\"]/div/div/div[2]/div[1]/div/div[2]/div/div/label/span")
    private WebElement wfhButton;

    @FindBy(id = "description")
    private WebElement note;

    @FindBy(xpath = "//*[@id=\"punch-in-modal\"]/div/div/div[3]/button[1]")
    private WebElement cancelButton;

    public dashBoardScreenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void dashBoardAdmin() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertEquals(pageHeading.getText(), "Dashboard", "Page heading does not match!");

        waitWebElement(punchInButton, driverTwo);
        punchInButton.click();

        waitWebElement(wfhButton, driverTwo);
        wfhButton.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(wfhButton).perform();

        waitWebElement(note, driverTwo);
        note.sendKeys("Only for testing uses");

        waitWebElement(cancelButton, driverTwo);
        cancelButton.click();

        Thread.sleep(3000);

    }
}
