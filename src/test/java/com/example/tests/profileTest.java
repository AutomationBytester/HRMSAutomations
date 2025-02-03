package com.example.tests;

import com.example.BaseTest;
import com.example.pages.loginPage;
import com.example.pages.profilePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class profileTest extends BaseTest {

    private com.example.pages.loginPage loginPage;
    private profilePage profilePage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    @Parameters("url")
    public void homePageTest(@Optional String url) throws InterruptedException {
        log.info("test started");
//
//        WebDriver driver = getWebDriver();
//
//        loginPage = new loginPage(driver, url);
//        loginPage.login(username, password);
//
//        profilePage = new profilePage(driver);
//        profilePage.profileScreenPage();
//
//        driver.quit();
//
//        Thread.sleep(3000);

        WebDriver driverTwo = getWebDriverTwo();

        loginPage = new loginPage(driverTwo, url);
        loginPage.login(usernameTwo, passwordTwo);

        profilePage = new profilePage(driverTwo);
        profilePage.profileScreenPage();

        driverTwo.close();
        driverTwo.quit();

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
