package uk.gov.service.vehicleenquiry.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class StartPage extends BasePage {

    @FindBy(how = How.CSS, using = "p.get-started a")
    private WebElement LINK_START_BUTTON;

    @FindBy(how = How.CSS, using = "h1.heading-large")
    private WebElement HEADER_TEXT;

//    WebDriverWait wait = new WebDriverWait(driver, 400);


    public StartPage(WebDriver driver) {
        super(driver);
    }

    public void selectStartNow(){
       LINK_START_BUTTON.click();
       WebDriverWait wait = new WebDriverWait(driver, 400);
       wait.until(ExpectedConditions.visibilityOf(HEADER_TEXT));
   }

}
