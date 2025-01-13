package com.example.pages;

import com.example.BaseTest;
import org.openqa.selenium.WebDriver;


public class BasePage extends BaseTest {

    protected WebDriver driver;

    protected WebDriver driverTwo;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
//    public BasePage(WebDriver driverTwo) {
//        this.driverTwo = driverTwo;
//    }

    public WebDriver getWebDriver() {
        return this.driver;
    }

    public WebDriver getWebDriverTwo() {
        return this.driverTwo;
    }

}
