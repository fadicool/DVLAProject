package uk.gov.service.vehicleenquiry.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class ErrorPage extends BasePage {

    @FindBy(how = How.CSS, using = "h1.error-summary-heading")
    private WebElement PAGE_ERROR_HEADER;

    @FindBy(how = How.CSS, using = "ul.error-summary-list a")
    private WebElement PAGE_ERROR_TEXT;

    @FindBy(how = How.CSS, using = "h3.heading-large")
    private WebElement MESSAGE_ERROR_HEADER;

    public ErrorPage(WebDriver driver) {
        super(driver);
    }

    public void validateErrorMessage(String err){

        if ("PAGE".equals(err.toUpperCase())) {
            Assert.assertTrue(PAGE_ERROR_HEADER.isDisplayed());
            Assert.assertTrue(PAGE_ERROR_HEADER.getText().equalsIgnoreCase("There was a problem"));
            Assert.assertTrue(PAGE_ERROR_TEXT.isDisplayed());

        } else if ("MESSAGE".equals(err.toUpperCase())) {
            Assert.assertTrue(MESSAGE_ERROR_HEADER.isDisplayed());
            Assert.assertTrue(MESSAGE_ERROR_HEADER.getText().equalsIgnoreCase("Vehicle details could not be found"));

        } else {
            System.out.println("Sorry! Unable to find ERROR message !!! ");
        }
    }


}
