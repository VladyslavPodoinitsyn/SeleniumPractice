package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.TableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {




    @Test
    public void task3_return_tims_due_amount() {
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);

        WebElement googleCountry = driver.findElement(By.xpath("//table[@id='customers']//td[.='Google']/../td[3]"));

        System.out.println("googleCountry = " + googleCountry.getText());

        String actualResult = googleCountry.getText();
        String expectedResult = "Germany";

        Assert.assertEquals(actualResult, expectedResult, "Cell is not returning as expected.");


    }


    @Test
    public void task4_verify_order_method() {
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);

        TableUtils.verifyOrder(driver, "Maria Anders");

    }

}
