package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVeryfication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification PASSED!");
        } else {
            System.out.println("Link text verification FAILED!");
        }

        String expectedInHrefValue = "index.html";
        String actualHrefValue = zeroBankLink.getAttribute("href");

        System.out.println(actualHrefValue);

        if (actualHrefValue.contains(expectedInHrefValue)) {
            System.out.println("Href value verification PASSED!");
        } else {
            System.out.println("Href value verification FAILED!");
        }
    }
}
