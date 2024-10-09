package com.cybertek.tests.day5_findElement_checkboxes;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each : listOfLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

        int numberOfLinks = listOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);
        
    }
}
