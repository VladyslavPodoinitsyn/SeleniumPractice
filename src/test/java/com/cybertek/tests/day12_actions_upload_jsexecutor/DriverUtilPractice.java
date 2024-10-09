package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {

    @Test
    public void simple_google_search_test() {

        Driver.getDriver().get("https://www.google.com");

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        String searchValue = ConfigurationReader.getProperty("searchValue");

        searchBox.sendKeys(searchValue + Keys.ENTER);

        BrowserUtils.sleep(3);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = searchValue;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        Driver.closeDriver();

        Driver.getDriver().get("https://etsy.com");

        Driver.closeDriver();

    }

}
