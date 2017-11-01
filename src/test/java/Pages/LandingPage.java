package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by imeeme on 9/30/16.
 */
public class LandingPage {



    private static WebElement element = null;


    public static WebElement Apps(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a"));

        return element;
    }

    public static WebElement CalendarApp(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='gb24']/span[1]"));

        return element;
    }
    
}
