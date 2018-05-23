package StepDefinitions;

import Utilities.BaseUtilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrafficDefenderSteps extends BaseUtilities {

    private BaseUtilities base;

    public TrafficDefenderSteps(BaseUtilities base) {
        this.base = base;
    }

        @Given("^I navigate to the website$")
        public void iNavigateToTheWebsite() throws Throwable {
            System.out.println("Gettiing URL");
            base.driver.get("https://www.google.co.uk");
        }

        @Given("^The user limit has not been exceeded$")
        public void theUserLimitHasNotBeenExceeded() throws Throwable {
            System.out.println("With a Single Thread");
        }

        @When("^The page loads$")
        public void thePageLoads() throws Throwable {
            System.out.println("Verify page has finished loading");
        }

        @Then("^I should see the expected page$")
        public void iShouldSeeTheExpectedPage() throws Throwable {
            System.out.println("Add an isDisplayed('homepage identifier') opt for url?");
        }

        @Given("^The user limit has been exceeded$")
        public void theUserLimitHasBeenExceeded() throws Throwable {
            System.out.println("With two threads");
        }

        @Then("^I am placed in the queue$")
        public void iAmPlacedInTheQueue() throws Throwable {
            System.out.println("Add an isDisplayed('queue page identifier') opt for url?");
        }

        @And("^I request an updated queue position$")
        public void iRequestAnUpdatedQueuePosition() throws Throwable {
            System.out.println("Click the request option");
        }

        @Then("^I should see my updated queue position$")
        public void iShouldSeeMyUpdatedQueuePosition() throws Throwable {
            System.out.println("Add an isDisplayed('updated queue posistion')");
        }

        @When("^The website becomes available$")
        public void theWebsiteBecomesAvailable() throws Throwable {
            System.out.println("Quit thread that has expected page");
        }
    }
