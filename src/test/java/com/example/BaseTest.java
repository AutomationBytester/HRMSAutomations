package com.example;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;
    protected WebDriver driverTwo;
    public long beforeTime = System.nanoTime();
    public long afterTime = System.nanoTime();
    public String username = ApplicationProperties.INSTANCE.getUsername();
    public String password = ApplicationProperties.INSTANCE.getPassword();
    public String usernameTwo = ApplicationProperties.INSTANCE.getUsernameTwo();
    public String passwordTwo = ApplicationProperties.INSTANCE.getPasswordTwo();

    Logger log = LoggerFactory.getLogger(BaseTest.class);

    @BeforeSuite
    public void beforeSuite() {
        log.info("Test Started");
    }

    @AfterSuite
    public void afterSuite() {
        log.info("Test case is End");
        log.info("total execution " + (afterTime - beforeTime) + "ms");
    }

    public void waitWebElement(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebDriver getWebDriver() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--headless=new");
        driver = new ChromeDriver(option);
//        driverTwo = new ChromeDriver(option);
        return driver;

    }

    public WebDriver getWebDriverTwo() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
//        option.addArguments("--headless=new");
        driverTwo = new ChromeDriver(option);
        return driverTwo;

    }

}
