package uk.gov.service.vehicleenquiry.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.gov.service.vehicleenquiry.drivers.DriverFactory;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class BasePage implements IBasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToStartPage(){
        driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
        PageFactory.initElements(driver, StartPage.class);
    }

}
