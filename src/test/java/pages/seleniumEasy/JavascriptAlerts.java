package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class JavascriptAlerts {
    public static void clickButtonToOpenAlertBox() {
        Common.clickElement(Locators.SeleniumEasy.JavascriptAlerts.);
    }

    public static void clickButtonToCloseAlertBox() {
        Common.acseptAlert();
    }
}
