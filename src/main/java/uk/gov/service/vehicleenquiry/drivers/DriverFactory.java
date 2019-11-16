package uk.gov.service.vehicleenquiry.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class DriverFactory {

    public DriverFactory() {
    }

    private static WebDriver driver ;

    public static ThreadLocal<WebDriver> threadedDriver = new ThreadLocal<WebDriver>();


    public static WebDriver getDriver(){
        return threadedDriver.get();
    }

    public static WebDriver createDriver(){
        String browserName = "Chrome";

        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        threadedDriver.set(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
