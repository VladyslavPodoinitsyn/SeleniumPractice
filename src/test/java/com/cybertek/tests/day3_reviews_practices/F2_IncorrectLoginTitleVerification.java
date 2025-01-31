package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("something123@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("something123" + Keys.ENTER);



        String actualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook";

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Title is correct!");
        } else {
            System.out.println("Title is wrong");
        }
    }
}
