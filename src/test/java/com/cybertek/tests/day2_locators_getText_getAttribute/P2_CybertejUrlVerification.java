package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertejUrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "cybertekschool";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is incorrect");
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }

    }
}
