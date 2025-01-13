package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class loginPage extends BasePage {

    @FindBy(id = "formData.email")
    private WebElement email;

    @FindBy(id = "formData.password")
    private WebElement pass;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[2]/div/form/div[5]/div/button/span")
    private WebElement loginButton;

    public loginPage(WebDriver driver, String url) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().manage().window().maximize();

        if (url == null) {
            getWebDriver().get(ApplicationProperties.INSTANCE.getBaseUrl());
        } else {
            getWebDriver().get(url);
        }

        if (url == null) {
            getWebDriver().get(ApplicationProperties.INSTANCE.getBaseUrlTwo());
        } else {
            getWebDriver().get(url);
        }

    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        email.clear();
        email.sendKeys(username);
        assertThat("username not sent", email.getAttribute("value"), is(username));

        pass.clear();
        pass.sendKeys(password);
        assertThat("password not sent", pass.getAttribute("value"), is(password));

        waitWebElement(loginButton, driver);
        loginButton.click();

    }

}
