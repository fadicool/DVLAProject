package uk.gov.service.vehicleenquiry.support;

import uk.gov.service.vehicleenquiry.drivers.DriverFactory;
import uk.gov.service.vehicleenquiry.pages.*;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class WorldHelper {

    private static StartPage startPage;
    private static ErrorPage errorPage;
    private static BasePage basePage;
    private static SearchPage searchPage;
    private static ConfirmationPage confirmationPage;

    public BasePage getBasePage() {
        if(basePage != null) return basePage;
        basePage = PageFactory.initElements(DriverFactory.createDriver(), BasePage.class);
        return basePage;
    }

    public StartPage getStartPage() {
        if(startPage != null) return startPage;
        startPage = PageFactory.initElements(DriverFactory.getDriver(), StartPage.class);
        return startPage;
    }

    public ErrorPage getErrorPage() {
        if(errorPage != null) return errorPage;
        errorPage = PageFactory.initElements(DriverFactory.getDriver(), ErrorPage.class);
        return errorPage;
    }

    public SearchPage getSearchPage() {
        if(searchPage != null) return searchPage;
        searchPage = PageFactory.initElements(DriverFactory.getDriver(), SearchPage.class);
        return searchPage;
    }

    public ConfirmationPage getConfirmationPage() {
        if(confirmationPage != null) return confirmationPage;
        confirmationPage = PageFactory.initElements(DriverFactory.getDriver(), ConfirmationPage.class);
        return confirmationPage;
    }
}
