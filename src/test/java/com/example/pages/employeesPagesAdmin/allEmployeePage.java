package com.example.pages.employeesPagesAdmin;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class allEmployeePage extends BasePage {

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

    @FindBy(id = "formData.first_name")
    private WebElement nameEnter;

    @FindBy(id = "formData.last_name")
    private WebElement lastNameEnter;

    @FindBy(id = "formData.email")
    private WebElement emailEnter;

    @FindBy(id = "formData.personal_email")
    private WebElement personalEmailEnter;

    @FindBy(xpath = "//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[4]/div/div/label[1]/span")
    private WebElement radioButton;

    @FindBy(id = "formData.employee_id")
    private WebElement employeeIdEnter;

    @FindBy(id = "formData.department_id")
    private WebElement departmentIdEnter;

    @FindBy(xpath = "//*[@id=\"formData.department_id\"]/option[10]")
    private WebElement optionEnter;

    @FindBy(id = "formData.designation_id")
    private WebElement designationIdEnter;

    @FindBy(xpath = "//*[@id=\"formData.designation_id\"]/option[15]")
    private WebElement softwareEnter;

    @FindBy(id = "formData.employment_status_id")
    private WebElement employmentStatusIdEnter;

    @FindBy(xpath = "//*[@id=\"formData.employment_status_id\"]/option[4]")
    private WebElement contractEnter;

    @FindBy(id = "dropdownMenuLink")
    private WebElement roleOption;

    @FindBy(id = "formData.salary")
    private WebElement salaryEnter;

    @FindBy(xpath = "//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[1]/div/input")
    private WebElement joiningButton;

    @FindBy(css = "button[class*='btn text-center btn-primary']")
    private WebElement addButton;

    @FindBy(css = "button[class*='btn btn-secondary mr-2']")
    private WebElement cancelButton;

//    @FindBy(xpath = "//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[2]")
//    private WebElement joiningCalendarButton;

    public allEmployeePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void allEmployee() throws InterruptedException {

        Thread.sleep(3000);
        employeeSideBarButton.click();

        waitWebElement(allEmployeeButton, driverTwo);
        allEmployeeButton.click();

        Assert.assertEquals(pageHeading.getText(), "All Employees", "Page heading does not match!");

        waitWebElement(listButton, driverTwo);
        listButton.click();

        waitWebElement(addEmployeeButton, driverTwo);
        addEmployeeButton.click();

        waitWebElement(nameEnter, driverTwo);
        nameEnter.sendKeys("hello");

        waitWebElement(lastNameEnter, driverTwo);
        lastNameEnter.sendKeys("World");

        waitWebElement(emailEnter, driverTwo);
        emailEnter.sendKeys("onlyForTest@gmail.com");

        waitWebElement(personalEmailEnter, driverTwo);
        personalEmailEnter.sendKeys("onlyForTest@gmail.com");

        waitWebElement(radioButton, driverTwo);
        radioButton.click();

        waitWebElement(employeeIdEnter, driverTwo);
        employeeIdEnter.click();

        waitWebElement(departmentIdEnter, driverTwo);
        departmentIdEnter.click();

        waitWebElement(optionEnter, driverTwo);
        optionEnter.click();

        waitWebElement(designationIdEnter, driverTwo);
        designationIdEnter.click();

        waitWebElement(softwareEnter, driverTwo);
        softwareEnter.click();

        waitWebElement(employmentStatusIdEnter, driverTwo);
        employmentStatusIdEnter.click();

        waitWebElement(contractEnter, driverTwo);
        contractEnter.click();

        waitWebElement(roleOption, driverTwo);
        roleOption.click();

        waitWebElement(salaryEnter, driverTwo);
        salaryEnter.click();

        waitWebElement(joiningButton, driverTwo);
        joiningButton.click();

//        Thread.sleep(2000);
//        CalendarPage calendarPage = new CalendarPage(driver);
//        calendarPage.selectDate("15", "January 2025");

        waitWebElement(addButton,driverTwo);
        addButton.click();

        Thread.sleep(3000);

    }
}
