package uk.gov.service.vehicleenquiry.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class SearchPage extends BasePage {

    @FindBy(how = How.CSS, using = "input#Vrm")
    private WebElement TEXT_BOX;

    @FindBy(how = How.CSS, using = "button.button")
    private WebElement CONTINUE_BUTTON;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterText (String vehReg){
        TEXT_BOX.sendKeys(vehReg);
    }

    public void selectContinue(){
        CONTINUE_BUTTON.click();
    }




}
