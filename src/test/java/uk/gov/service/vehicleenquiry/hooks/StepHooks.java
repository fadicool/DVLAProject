package uk.gov.service.vehicleenquiry.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import uk.gov.service.vehicleenquiry.drivers.DriverFactory;

/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class StepHooks extends EventFiringWebDriver {

    private static final WebDriver REAL_DRIVER = DriverFactory.createDriver();

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            REAL_DRIVER.quit();
        }
    };


    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    public StepHooks() {
        super(REAL_DRIVER);
    }

    @Override
    public void quit() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException("You shouldn't quit this WebDriver. It's shared and will quit when the JVM exits.");
        }
        super.quit();
    }

//    @Before
//    private void before(){
//        manage().deleteAllCookies();
//    }
//
//    @After
//    private void after(){
//
//    }
}
