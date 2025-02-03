package com.example.pages.attendancePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class attendanceRequestPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[4]/a")
    private WebElement attendanceButton;

    @FindBy(xpath = "//*[@id=\"attendance\"]/ul/li[2]/a")
    private WebElement attendanceRequestButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/button")
    private WebElement requestAttendanceButton;

    @FindBy(id = "formData.inn_time")
    private WebElement dateDropDown;

    @FindBy(id = "//*[@id=\"attendance-modal\"]/div/div/div[2]/form/div[1]/div[1]/div/div/div/div/div[2]/div[1]/ul/li[11]")
    private WebElement time;

    @FindBy(xpath = "//*[@id=\"attendance-modal\"]/div/div/div[2]/form/div[1]/div[2]/div/div/span/div[1]/div/input")
    private WebElement date;

    public attendanceRequestPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void attendanceRequest() throws InterruptedException {

        Thread.sleep(2000);
        attendanceButton.click();

        waitWebElement(attendanceRequestButton, driver);
        attendanceRequestButton.click();
        Assert.assertEquals(pageHeading.getText(), "Attendance Request", "Page heading does not match!");

        waitWebElement(requestAttendanceButton, driver);
        requestAttendanceButton.click();

//        waitWebElement(dateDropDown, driver);
//        dateDropDown.click();

//        waitWebElement(time, driver);
//        Select select = new Select(time);
//        select.selectByVisibleText("11:00");

//        waitWebElement(date, driver);
//        date.click();
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(time).click().perform();
        Thread.sleep(3000);
    }
}
