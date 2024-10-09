package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsctionsPractices {

    @Test
    public void p2_double_click_test() {

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        Actions action = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);

        action.doubleClick(textToDoubleClick);
        action.perform();

        String expectedInStyle = "red";
        String actual = textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actual.contains(expectedInStyle));

    }

}
