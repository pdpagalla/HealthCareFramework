package utilities;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils
{

    public static void clickElement(WebDriver driver,By by){

    driver.findElement(by).click();
    }



    public static void selectDropDown(String locator, String value)
    {

    }

    public static void clickOnText(WebDriver driver,String text) throws Exception {
        if(isElementExists(driver,By.linkText(text)))
        {
            driver.findElement(By.linkText(text)).click();
        }
        else
        {
            throw new Exception("HealthCare Project: Element with text"+text+" is not existing");
        }
    }

    public static boolean isElementExists(WebDriver driver,By by){

        if(driver.findElements(by).size()>0){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean checkTextPresentOnPage(WebDriver driver,String text){

        return driver.findElement(By.tagName("body")).getText().contains(text);
    }
}
