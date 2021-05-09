package stepDefs;

import PatientPages.PatientModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserFactory;


public class PatientStepDefs extends StepDefinitions {

    PatientModulePage patientModulePage;

    @Given("admin is in dashboard")
    public void admin_is_in_dashboard_page(){
        getDriver();
    }

    @When("he go to patient module")
    public void he_go_to_patient_module() throws InterruptedException {
        patientModulePage = new PatientModulePage(BrowserFactory.driver);
        patientModulePage.clickPatientModule();
    }

    @When("select to add a patient")
    public void select_to_add_a_patient() throws InterruptedException {
        patientModulePage.clickAddNewPatient();
    }
    @When("fill the patient details with {string}, {string},{string},{string},{string} and {string}")
    public void fill_the_patient_details_with(String pName,String gender,String DOB,String mobile,String email,String symptoms){
        patientModulePage.setPatientName(pName);
        patientModulePage.setGender(gender);
        patientModulePage.setDOB(DOB);
        patientModulePage.setMobileNumber(mobile);
        patientModulePage.setEmail_ID(email);
        patientModulePage.setSymptoms(symptoms);
    }
    @When("Save the patient")
    public void save_the_patient(){
        patientModulePage.patientDetailsSave();
    }

    @When("search for the {string}")
    public void search_for_the(String pName) {
        patientModulePage.setSearchPatient(pName);
    }

    @Then("{string} should be available in the search result")
    public void he_should_be_available_in_the_search_result(String pName){
        patientModulePage.setSearchResultsAvailable(pName);
    }

    @Then("{string} should be not be available in the search result")
    public void he_should_not_be_available_in_the_search_result(String pName){
        patientModulePage.setSearchResultsNotAvailable(pName);
    }

    @When("select {string} to view a patient")
    public void select_to_view_a_patient(String oldName) {
        patientModulePage.clickOldPatient(oldName);
    }

    @When("select to edit a patient")
    public void select_to_edit_a_patient() {
        patientModulePage.editPatientDetailsButton();

    }
    @When("edit the patient details with {string}")
    public void edit_the_patient_details_with(String newName) {
        patientModulePage.setPatientName(newName);
    }

    @When("select to delete a patient")
    public void select_to_delete_a_patient() {
        patientModulePage.deletePatientDetailsButton();
    }

    @When("select OK in delete confirmation pop up")
    public void select_ok_in_delete_confirmation_pop_up(){
        patientModulePage.clickOkButton();
    }

}

