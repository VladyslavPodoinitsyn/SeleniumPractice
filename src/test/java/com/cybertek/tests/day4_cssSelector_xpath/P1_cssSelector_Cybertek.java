package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homelink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputBox = driver.findElement(By.cssSelector("input[name='email']"));



    }
}
