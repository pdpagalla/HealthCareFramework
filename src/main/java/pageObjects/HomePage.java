package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtils;

public class HomePage extends BasePage
{

    public String headerText = "My Account";


    public HomePage(WebDriver driver){
        super(driver);
    }

    public void gotoLoginPage() throws Exception {
        WebDriverUtils.clickOnText(driver,"Sign in");
    }


    public boolean isUserInHomePage(WebDriver driver) {
        return WebDriverUtils.checkTextPresentOnPage(driver,headerText);
    }
}
