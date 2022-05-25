package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static ThreadLocal<WebDriver>driver = new ThreadLocal<>();
    //bus viena kopija sio obj

    public static void setDriver(){
        WebDriverManager.chromedriver().setup();
         driver.set (new ChromeDriver());
    }
    public static WebDriver getDriver(){
        return driver.get();
    }
    public static void closeDriver(){
        driver.get().quit();
        driver.remove();
    }

  //  private static WebDriver driver; //bus viena kopija sio obj

  //  public static void setDriver(){
  //      WebDriverManager.chromedriver().setup();
   //     driver = new ChromeDriver();
  //  }
  //  public static WebDriver getDriver(){
   //     return driver;
    }
   // public static void closeDriver(){
     //   driver.quit();
   // }