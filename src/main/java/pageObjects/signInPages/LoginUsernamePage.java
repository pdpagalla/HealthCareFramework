package pageObjects.signInPages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUsernamePage extends BasePage
{


   // @FindBy(id = "auth_key") public WebElement TextFieldUserNameOrEmailOrPhone;
   // @FindBy (id = "log_in") public WebElement NextButton;

    @FindBy (id = "auth_key") public WebElement usernameTextBox;
    @FindBy (id = "log_in") public WebElement signInButton;

    public LoginUsernamePage(WebDriver driver){
        super(driver);
    }


    public void setUsername(String loginUsername) {
        usernameTextBox.sendKeys(loginUsername);
        signInButton.click();

    }
}
