package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;

public class BookingStepDefs extends StepDefinitions {

//    @Before
//    public void startBrowser(){
//        getDriver();
//    }

//    @After
//    public void stopBrowser(){
//        stopDriver();
//    }

    @Given("The user clicks on Book an Appointment tab")
    public void the_user_clicks_on_book_an_appointment_tab() {

    }
    @When("patient selects {string} session")
    public void patient_selects_session(String string) {

    }
    @Then("he should be navigated to {string} page")
    public void he_should_be_navigated_to_page(String string) {

    }
    @When("patient select any available slot and book that appointment")
    public void patient_select_any_available_slot_and_book_that_appointment() {

    }
    @Then("the booking should be successfull")
    public void the_booking_should_be_successfull() {

    }
}
