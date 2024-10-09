package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitPractice {

    @Test
    public void dynamic_loading_7_test() {

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

    }


    @Test
    public void dynamic_loading_1_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        dynamicLoad1Page.startButton.click();

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        dynamicLoad1Page.inputPassword.sendKeys("incorrectpassword");

        dynamicLoad1Page.submitButton.click();

        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

    }


}
