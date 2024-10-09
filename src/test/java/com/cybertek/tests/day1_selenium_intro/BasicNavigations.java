package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesla.com");

        String currentURL = driver.getCurrentUrl();

        System.out.println("Current URL: " + currentURL);

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        currentURL = driver.getCurrentUrl();

        System.out.println("Current URL: " + currentURL);

        driver.manage().window().maximize();

        driver.close();

    }
}
