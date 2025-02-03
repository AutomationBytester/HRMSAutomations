package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage {
    WebDriver driver;

    // Locators
    private By calendarInput = By.xpath("//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[2]"); // Locator for the calendar input field
    private By nextButton = By.xpath("//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[2]/div/div/div[1]/div[2]/div[2]/svg"); // Locator for next button
    private By prevButton = By.xpath("//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[2]/div/div/div[1]/div[2]/div[1]/svg"); // Locator for previous button
    private By monthYearLabel = By.xpath("//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]"); // Locator for the displayed month and year
    private By specificDay(String day) {
        return By.xpath("//*[@id=\"employee-list-modal\"]/div/div/div[2]/form/div[9]/div/span/div[2]/div/div/div[1]/div[1]/div/div/div[2]"); // Locator for selecting a specific day
    }

    // Constructor
    public CalendarPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void openCalendar() {
        driver.findElement(calendarInput).click(); // Click to open the calendar
    }

    public void navigateToMonthYear(String targetMonthYear) {
        while (!driver.findElement(monthYearLabel).getText().equals(targetMonthYear)) {
            driver.findElement(nextButton).click(); // Click next until the target month and year is displayed
        }
    }

    public void selectDay(String day) {
        driver.findElement(specificDay(day)).click(); // Click the specific day
    }

    public void selectDate(String day, String monthYear) {
        openCalendar();
        navigateToMonthYear(monthYear);
        selectDay(day);
    }

    public By getPrevButton() {
        return prevButton;
    }

    public void setPrevButton(By prevButton) {
        this.prevButton = prevButton;
    }
}
