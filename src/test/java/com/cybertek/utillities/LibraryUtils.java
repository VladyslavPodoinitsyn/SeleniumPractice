package com.cybertek.utillities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {

    public static void loginToLibrary(WebDriver driver) {
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");

        WebElement logIn = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        logIn.click();
    }
}
