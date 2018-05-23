package Hooks;

import Factories.DriverFactory;
import Utilities.BaseUtilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class TrafficDefenderHooks extends BaseUtilities {

    private BaseUtilities base;

    public TrafficDefenderHooks(BaseUtilities base) {
        this.base = base;
    }

    @Before
    public void startUp()
    {
        base.driver = new DriverFactory().makeDriver("chrome");
        base.driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        base.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        System.out.println("Starting Driver and setting timeouts");
    }

    @After
    public void tearDown()
    {
        base.driver.manage().deleteAllCookies();
        base.driver.quit();
        System.out.println("Quitting Driver and deleting all cookies");
    }
}
