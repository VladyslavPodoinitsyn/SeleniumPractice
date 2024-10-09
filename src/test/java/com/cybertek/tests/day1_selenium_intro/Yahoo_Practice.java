package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String currentTitle = driver.getTitle();

        String epxectedTitle = "Yahoo";

        if (currentTitle.equals(epxectedTitle)) {
            System.out.println("Title as expected. Verification PASSED!");
        } else {
            System.out.println("Title not as expected. Verification FAILED!");
            System.out.println("Current Title = " + currentTitle);
        }

        driver.close();
    }
}
