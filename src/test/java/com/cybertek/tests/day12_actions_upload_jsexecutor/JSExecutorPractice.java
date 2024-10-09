package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractice {

    @Test
    public void scroll_using_jsExecutor_test1() {

        Driver.getDriver().get("https://scrollmagic.io/examples/advanced/infinite_scrolling.html");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(3);
            js.executeScript("window.scrollBy(0, 750)");
        }

        js.executeScript("window.scrollBy(0, -750)");


    }

    @Test
    public void sroll_using_jsExecutor_test2() {
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);

        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);


    }

}
