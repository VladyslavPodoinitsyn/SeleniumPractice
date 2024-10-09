package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test() {

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path = "C:\\Users\\vladp\\OneDrive\\Рабочий стол\\Screenshot 2024-08-23 222319.png";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        WebElement submitButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(3);

        chooseFile.sendKeys(path);

        submitButton.click();

        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());




    }

}
