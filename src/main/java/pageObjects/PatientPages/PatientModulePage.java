package pageObjects.PatientPages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utilities.BrowserFactory;

import java.util.List;

public class PatientModulePage extends BrowserFactory {

    String searchName ;

    public PatientModulePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "div.sidebar-item.patients span.text")
    public WebElement patientsModule;

    @FindBy(how = How.CSS, using = "button[cssclass='e-normal add-details']")
    public WebElement addNewPatient;

    @FindBy(how = How.CSS,using="input[name='Name']")
    public WebElement patientName;

    @FindBy(how = How.CSS,using="input#doctorCheckMale")
    public WebElement genderMale;

    @FindBy(how = How.CSS,using = "input#doctorCheckFemale")
    public WebElement genderFemale;

    @FindBy(how = How.CSS,using = "input#DOB_input ")
    public WebElement DOB;

    @FindBy(how = How.CSS,using = "input#Mobile")
    public WebElement mobileNumber;

    @FindBy(how = How.CSS,using = "input[name='Email']")
    public WebElement email_ID;

    @FindBy(how = How.CSS,using = "input[name=\"Symptoms\"]")
    public WebElement patientSymptoms;

    @FindBy(how = How.XPATH,using = "//button[normalize-space()='Save']")
    public WebElement patientDetailsSaveButton;

    @FindBy(how = How.XPATH,using = "//button[normalize-space()='Cancel']")
    public WebElement patientDetailsCancelButton;

    @FindBy(how = How.CSS,using = "#schedule_searchbar")
    public WebElement searchPatient;

    @FindBy(how = How.CSS, using = "div[class='e-gridcontent e-responsive-header'] tr:nth-child(1) td:nth-child(2) span")
    public WebElement firstPatientDetails;

    @FindBy(how = How.CSS,using ="button#edit" )
    public WebElement editPatientDetailsButton;

    @FindBy(how = How.CSS,using ="button#delete" )
    public WebElement deletePatientDetailsButton;

    @FindBy(how = How.CSS,using ="ejs-dialog[header=\"Patient Details\"] div:nth-child(3) button:first-child" )
    public WebElement okConfirmationButton;


    @FindBy(how = How.CSS, using = "span[class=\"patient-name\"]")
    public List<WebElement> allElements;



    public void clickPatientModule() throws InterruptedException {
        patientsModule.click();
    }

    public void clickAddNewPatient() throws InterruptedException {
        addNewPatient.click();
        Thread.sleep(5000);
    }

    public void editPatientDetailsButton(){
        editPatientDetailsButton.click();
    }

    public void deletePatientDetailsButton(){
        deletePatientDetailsButton.click();
    }

    public void setPatientName(String pName) {
        patientName.clear();
       patientName.sendKeys(pName);
    }

    public void setGender(String gender){
        if(gender=="Male"){
            genderMale.click();
        }else {
            genderFemale.click();
        }
    }

    public void setDOB(String dob){
        DOB.clear();
        DOB.sendKeys(dob);
    }

    public void setMobileNumber(String mobile){
        mobileNumber.clear();
        mobileNumber.sendKeys(mobile);
    }

    public void setEmail_ID(String mailID){
        email_ID.sendKeys(mailID);
    }

    public void setSymptoms(String symptoms){
        patientSymptoms.sendKeys(symptoms);
    }

    public void patientDetailsSave(){
        patientDetailsSaveButton.click();
    }

    public void setSearchPatient(String pName){
        searchPatient.clear();
        searchPatient.sendKeys(pName);
    }

    public void setSearchResultsAvailable(String pName){
        int size = allElements.size();
        System.out.println("no of records ----------------------------> "+size);
        for(int i=0;i<size;i++){
           searchName = allElements.get(i).getText();
           System.out.println("------------------------------------------> "+searchName);
            if(searchName.contains(pName)){
                System.out.println("Found search Record: "+searchName);
                break;
            }else{
                System.out.println("Record not found for : "+searchName);
            }
        }

        Assertions.assertEquals(searchName,pName);

    }
    public void setSearchResultsNotAvailable(String pName){

        Assertions.assertEquals(allElements.size(), 0);
    }

    public void clickOldPatient(String oldName){
        int size = allElements.size();
        System.out.println("no of records ----------------------------> "+size);
        for(int i=0;i<size;i++){
            searchName = allElements.get(i).getText();
            System.out.println("------------------------------------------> "+searchName);
            if(searchName.contains(oldName)){
                System.out.println("Found search Record: "+searchName);
                allElements.get(i).click();
            }else{
                System.out.println("Record not found for : "+searchName);
            }
        }
    }

    public void clickOkButton(){
        okConfirmationButton.click();
    }

}
