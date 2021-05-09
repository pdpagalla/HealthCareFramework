package utilities;

import config.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory
{
   /* static WebDriver driver;
    //Invoke Browser - Local/Browserstack/Docker/AWS/HEadless

    public static WebDriver invokeBrowser(String targetDevice){
        return null;

    }
    public static WebDriver getDriver(){
        return driver;
    }

    public static boolean validateBrowserStackcredentials(String username, String password){
        return false;


    }

    */


    public static WebDriver driver;

    public static WebDriver getDriver() {


        if(driver==null){

            {

                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }


//            driver.get(Constants.BASE_URL);
            driver.get(Constants.SHOWCASE_APP_URL);
        }


        return  driver;
    }

    public static void stopDriver(){
        driver.quit();
        driver = null;
    }


}
