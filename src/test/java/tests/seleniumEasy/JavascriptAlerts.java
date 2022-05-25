package tests.seleniumEasy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptAlerts extends BaseTest {

    @BeforeMethod
    public void openLink(0{
        pages.seleniumEasy.JavascriptAlerts.open();
    }
    @Test
    public void closealertBox() {
        pages.seleniumEasy.JavascriptAlerts.clickButtonToOpenAlertBox();
        pages.seleniumEasy.JavascriptAlerts.clickButtonToCloseAlertBox();
       // pages.seleniumEasy.JavascriptAlerts.clickButtonToOpenAlertBox();
    }
}
