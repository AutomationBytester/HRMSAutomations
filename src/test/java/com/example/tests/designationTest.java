package com.example.tests;

import com.example.BaseTest;
import com.example.pages.employeesPagesAdmin.designationPage;
import com.example.pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class designationTest extends BaseTest {

    private com.example.pages.loginPage loginPage;
    private com.example.pages.employeesPagesAdmin.designationPage designationPage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    @Parameters("url")
    public void Designation(@Optional String url) throws InterruptedException {

        log.info("test started");

        WebDriver driverTwo = getWebDriverTwo();

        loginPage = new loginPage(driverTwo, url);
        loginPage.login(usernameTwo, passwordTwo);

        designationPage = new designationPage(driverTwo);
        designationPage.designation();
    }

    @AfterTest
    public void afterTest() {
        log.info("test completed");
        if (driverTwo != null) {
            driverTwo.close();
            driverTwo.quit();
        }
    }
}


