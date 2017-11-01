package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by innocentmeeme on 11/1/17.
 */
public class SignInPage extends LandingPage {
    private static WebElement element = null;


    public static WebElement AddEmailchrome(WebDriver driver){

        element = driver.findElement(By.id("identifierId"));

        return element;
    }
    public static WebElement AddEmail(WebDriver driver){

        element = driver.findElement(By.id("Email"));

        return element;
    }



    public static WebElement GoToNextChrome(WebDriver driver){

        element = driver.findElement(By.id("identifierNext"));

        return element;
    }
    public static WebElement GoToNext(WebDriver driver){

        element = driver.findElement(By.id("next"));

        return element;
    }

    public static WebElement FogortEmail(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[1]/button"));

        return element;
    }


    public static WebElement EnterPassword(WebDriver driver){

        element = driver.findElement(By.id("Passwd"));

        return element;
    }

    public static WebElement SingIn(WebDriver driver){

        element = driver.findElement(By.id("signIn"));

        return element;
    }

}
