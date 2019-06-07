package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FaceBookTestingApp {


    public static final String XPATH_SELECT_DAY = "//select[contains(@id,\"day\")]";
    public static final String XPATH_SELECT_MONTH = "//select[contains(@id,\"month\")]";
    public static final String XPATH_SELECT_YEAR = "//select[contains(@id,\"year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement webElementDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(webElementDay);
        selectDay.selectByIndex(12);

        WebElement webElementMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(webElementMonth);
        selectMonth.selectByIndex(3);

        WebElement webElementYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(webElementYear);
        selectYear.selectByValue("1965");

    }
}
