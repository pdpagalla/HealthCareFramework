package pageObjects.signInPages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPasswordPage extends BasePage {


    @FindBy(id = "password") public WebElement passwordTextBox;
    @FindBy (id = "log_in") public WebElement signInButton;

    public SignInPasswordPage(WebDriver driver){
        super(driver);
    }


    public void setPassword(String password) {
        passwordTextBox.sendKeys(password);
        signInButton.click();

    }

}
