package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowPractice {

    WebDriver driver;

    @BeforeMethod
    public  void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
    }

    @Test
    public void window_test() {
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Window Handles Practice - H Y R Tutorials";
        String mainHandle = driver.getWindowHandle();

        System.out.println("actualTitleBeforeClick = " + actualTitleBeforeClick);

        WebElement clickHereLink = driver.findElement(By.xpath("//button[@id = 'newTabBtn']"));
        clickHereLink.click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("CURRENT TITLE WHILE SWITCHING: " + driver.getTitle());
        }


        System.out.println("mainHandle = " + mainHandle);

        String actualTitleAfterClick = driver.getTitle();
        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

    }


}
