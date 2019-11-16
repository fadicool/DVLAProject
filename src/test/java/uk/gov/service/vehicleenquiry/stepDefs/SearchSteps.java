package uk.gov.service.vehicleenquiry.stepDefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.gov.service.vehicleenquiry.Utils.FileReader;
import uk.gov.service.vehicleenquiry.Utils.FileReaderUtil;
import uk.gov.service.vehicleenquiry.support.WorldHelper;

import java.io.File;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class SearchSteps {

    private WorldHelper helper;
    private FileReaderUtil  fileReaderUtil;

    String vReg = "";
    String vMak = "";
    String vCol = "";

    public SearchSteps(WorldHelper helper , FileReaderUtil reader){
        this.helper = helper;
        this.fileReaderUtil = reader;
    }


    @Given("^I am on DVLAs Vehicles Information Page$")
    public void i_am_on_DVLAs_Vehicles_Information_Page() throws Throwable {
        helper.getBasePage().goToStartPage();
    }

    @Given("^I proceed to check vehicles specific details$")
    public void i_proceed_to_check_vehicles_specific_details() throws Throwable {
        helper.getStartPage().selectStartNow();
    }

    @When("^I enter vehicle registration number ([^\"]*) in the searchBox$")
    public void i_enter_vehicle_registration_number_KN_KTP(String vehReg) throws Throwable {
        helper.getSearchPage().enterText(vehReg);
    }

    @When("^press the continue button$")
    public void press_the_continue_button() throws Throwable {
        helper.getSearchPage().selectContinue();
    }

    @Then("^the vehicles make ([^\"]*) and colour ([^\"]*) should be displayed$")
    public void the_vehicles_make_and_colour_should_be_displayed(String vMake, String vColour) throws Throwable {
        helper.getConfirmationPage().validateVehiclesMake(vMake);
        helper.getConfirmationPage().validateVehiclesColour(vColour);
    }

    @Then("^an error ([^\"]*) should be displayed$")
    public void an_error_should_be_displayed(String eType) throws Throwable {
        helper.getErrorPage().validateErrorMessage(eType);
    }

    @Given("^I get external test data ([^\"]*)$")
    public void i_get_external_test_data(String fileName) throws Throwable {
        vReg = fileReaderUtil.getVehicheReg(fileName);
        vMak = fileReaderUtil.getMake(fileName);
        vCol = fileReaderUtil.getColoue(fileName);

    }

    @When("^I enter a vehicles registration number in the searchBox$")
    public void i_enter_a_vehicles_registration_number_in_the_searchBox() throws Throwable {
        helper.getSearchPage().enterText(vReg);

    }

    @Then("^I should be taken to the relevant page$")
    public void i_should_be_taken_to_the_relevant_page() throws Throwable {
       //todo
       //assertions of vehicles MAKE and COLOUR
    }


}
