package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.TelerikPage;
import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void drag_and_drop_test() {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        TelerikPage telerikPage = new TelerikPage();
        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(5);
        actions.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();

        String expected = "You did great!";
        String actual = telerikPage.bigCircle.getText();

        Assert.assertEquals(actual, expected);



    }

}
