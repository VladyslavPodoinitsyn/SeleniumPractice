package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utillities.Driver;
import org.testng.annotations.Test;

public class DriverUsingExample {

    @Test
    public void how_to_use_driver() {

        Driver.getDriver().get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

    }
}
