package stepDefs;

import config.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.signInPages.LoginUsernamePage;
import pageObjects.signInPages.SignInPasswordPage;

public class UserAccountsStepsDefinitions extends StepDefinitions {

    HomePage homePage;
    LoginUsernamePage loginUsernamePage;
    SignInPasswordPage signInPasswordPage;

//    @Before
//    public void startBrowser(){
//        getDriver();
//    }
//
//    @After
//    public void stopBrowser(){
//        stopDriver();
//    }

    @Given("a patient is logged in and is in home page")
    public void a_patient_is_logged_in_and_is_in_home_page() throws Exception {

        homePage = new HomePage(driver);

        homePage.gotoLoginPage();

        loginUsernamePage = new LoginUsernamePage(driver);

        loginUsernamePage.setUsername(Constants.LOGIN_USERNAME);

        signInPasswordPage = new SignInPasswordPage(driver);

        signInPasswordPage.setPassword(Constants.LOGIN_PASSWORD);

        Assert.assertTrue("Checking User is in HomePage",homePage.isUserInHomePage(driver));

    }

}
