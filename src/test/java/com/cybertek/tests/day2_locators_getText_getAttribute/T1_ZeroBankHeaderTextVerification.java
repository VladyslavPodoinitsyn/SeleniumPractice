package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";

        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        String actualHeaderText = actualHeader;
        System.out.println(actualHeaderText);

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header verification PASSED!");
        } else {
            System.out.println("Header verification FAILED!");
        }
    }
}
