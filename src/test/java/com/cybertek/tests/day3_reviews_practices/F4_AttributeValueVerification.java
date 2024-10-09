package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref = "registration_form";
        String actualHref = createPageLink.getAttribute("href");

        System.out.println("actualHref = " + actualHref);

        if (actualHref.contains(expectedInHref)) {
            System.out.println("HREF verification PASSED!");
        } else {
            System.out.println("HREF verification FAILED!");
        }

    }
}
