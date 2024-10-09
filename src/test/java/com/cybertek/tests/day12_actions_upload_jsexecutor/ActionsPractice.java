package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void tc15_actions_hover() {

        Driver.getDriver().get("https://hover.to/");

        WebElement li1 = Driver.getDriver().findElement(By.xpath("//div[@class='mghmm-wrapper']/ul/li[1]"));
        WebElement li2 = Driver.getDriver().findElement(By.xpath("//div[@class='mghmm-wrapper']/ul/li[2]"));
        WebElement li3 = Driver.getDriver().findElement(By.xpath("//div[@class='mghmm-wrapper']/ul/li[3]"));


        WebElement firstWord1 = Driver.getDriver().findElement(By.xpath("//div[@class='mghmm-wrapper']/ul/li[1]/div/ul/li[1]"));
        WebElement firstWord2 = Driver.getDriver().findElement(By.xpath("//div[@class='mghmm-wrapper']/ul/li[2]/div/ul/li[1]"));
        WebElement firstWord3 = Driver.getDriver().findElement(By.xpath("//div[@class='mghmm-wrapper']/ul/li[3]/div/ul/li[1]"));


        WebElement cookies = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        BrowserUtils.sleep(5);
        cookies.click();

        BrowserUtils.sleep(3);

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(li1).perform();
        Assert.assertTrue(firstWord1.isDisplayed());

        BrowserUtils.sleep(3);

        actions.moveToElement(li2).perform();
        Assert.assertTrue(firstWord2.isDisplayed());

        BrowserUtils.sleep(3);

        actions.moveToElement(li3).perform();
        Assert.assertTrue(firstWord3.isDisplayed());


    }

    @Test
    public void scrolling_test() {

        Driver.getDriver().get("https://hover.to/");

        WebElement cookies = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        BrowserUtils.sleep(5);
        cookies.click();

        Actions actions = new Actions(Driver.getDriver());

        WebElement design = Driver.getDriver().findElement(By.linkText("Design now"));

        BrowserUtils.sleep(3);

        actions.moveToElement(design).perform();

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP).perform();



    }


}
