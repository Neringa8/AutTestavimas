package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utilities.Driver;
import utilities.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void setup(){
        Driver.setDriver();
    }
    @AfterMethod
    public void teardrop(){
        Driver.closeDriver();
    }
}

