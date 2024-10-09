package com.cybertek.tests.base;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browser = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browser);

    }


    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }


}
