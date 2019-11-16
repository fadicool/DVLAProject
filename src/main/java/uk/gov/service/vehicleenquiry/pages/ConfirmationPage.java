package uk.gov.service.vehicleenquiry.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class ConfirmationPage extends BasePage {

    @FindBy(how = How.CSS, using = "ul.list-summary li:nth-child(1) span.reg-mark")
    private WebElement VEHICLES_REG;

    @FindBy(how = How.CSS, using = "ul.list-summary li:nth-child(2) span:nth-child(2)")
    private WebElement VEHICLES_MAKE;

    @FindBy(how = How.CSS, using = "ul.list-summary li:nth-child(3) span:nth-child(2)")
    private WebElement VEHICLES_COLOR;


    public ConfirmationPage(WebDriver driver) {
        super(driver);
        driver.findElement(By.className("back")).isDisplayed();
    }

    public String getVehiclesRegistration() {
        return VEHICLES_REG.getText();
    }

    public String getVehiclesMake() {
        return VEHICLES_MAKE.getText();
    }

    public String getVehiclesColour() {
        return VEHICLES_COLOR.getText();
    }

    public void validateVehiclesRegistration(String reg) {
        Assert.assertTrue(VEHICLES_REG.getText().equalsIgnoreCase(reg));
    }

    public void validateVehiclesMake(String make){
        Assert.assertTrue(VEHICLES_MAKE.getText().equalsIgnoreCase(make));
    }

    public void validateVehiclesColour(String colour){
        Assert.assertTrue(VEHICLES_COLOR.getText().equalsIgnoreCase(colour));
    }


}
