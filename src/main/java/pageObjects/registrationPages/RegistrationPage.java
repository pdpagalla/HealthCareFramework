package pageObjects.registrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage
{
    WebDriver driver;

    /*@FindBy(id = "validated_user_first_name") public WebElement TextFieldFirstName;
    @FindBy (id = "validated_user_preferred_name") public WebElement TextFieldPrefferedName;
    @FindBy (id = "validated_user_last_name") public WebElement TextFieldLastName;
    @FindBy (id = "validated_user_email") public WebElement TextFieldEmail;
    @FindBy(id = "mobile_phone_country") public WebElement SelectCountry;

     */



    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
