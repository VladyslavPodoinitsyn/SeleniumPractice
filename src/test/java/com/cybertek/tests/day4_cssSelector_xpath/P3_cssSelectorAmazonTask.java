package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelectorAmazonTask {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);



        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : wooden spoon";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login page title verification PASSED");
        } else {
            System.out.println("Login page title verification FAILED");
        }

    }
}
