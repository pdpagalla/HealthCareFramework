package stepDefs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class StepDefinitions {

    public static WebDriver driver;

    public void getDriver() {
        BrowserFactory.getDriver();
    }

    public void stopDriver(){
       BrowserFactory.stopDriver();
    }


}
