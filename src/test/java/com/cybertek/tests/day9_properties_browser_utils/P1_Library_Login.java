package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.LibraryUtils;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class P1_Library_Login {

    WebDriver driver;

    @BeforeMethod
    public  void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://library2.cybertekschool.com/login.html");
    }


    @Test
    public void login_link_count_test() {

        LibraryUtils.loginToLibrary(driver);

        BrowserUtils.sleep(2);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }

    }

}
