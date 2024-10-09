package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogin {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.facebook.com/");

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login page title verification PASSED");
        } else {
            System.out.println("Login page title verification FAILED");
        }

        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("Tester");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("[contains(@id,'u_0_5_')]"));
        loginButton.click();
    }
}
