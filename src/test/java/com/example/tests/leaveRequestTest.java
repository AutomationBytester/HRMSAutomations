package com.example.tests;

import com.example.BaseTest;
import com.example.pages.leavePages.leaveRequestPage;
import com.example.pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class leaveRequestTest extends BaseTest{

    private com.example.pages.loginPage loginPage;
    private com.example.pages.leavePages.leaveRequestPage leaveRequestPage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);


    @Test
    @Parameters("url")
    public void leaveRequest(@Optional String url) throws InterruptedException {
        log.info("test started");
        WebDriver driver = getWebDriver();

        loginPage = new loginPage(driver, url);
        loginPage.login(username, password);

        leaveRequestPage = new leaveRequestPage(driver);
        leaveRequestPage.LeaveRequest();

    }

    @AfterTest
    public void afterTest() {
        log.info("test completed");
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
