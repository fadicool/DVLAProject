package uk.gov.service.vehicleenquiry;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
     plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
     features = "src/test/resources/features/",
     glue = {"uk/gov/service/vehicleenquiry/"},
     tags = {"@Test-Done" , "~@ignore"})

    public class RunnerCukesTest {

}
