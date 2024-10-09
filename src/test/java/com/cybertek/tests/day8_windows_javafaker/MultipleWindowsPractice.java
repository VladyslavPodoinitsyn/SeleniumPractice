package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public  void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
    }


    @Test
    public void multiple_windows_test() {
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Title in current page: " + driver.getTitle());

            if (driver.getTitle().contains("etsy")){
                Assert.assertTrue(driver.getTitle().contains("etsy"));
                break;
            }

        }


    }



}
