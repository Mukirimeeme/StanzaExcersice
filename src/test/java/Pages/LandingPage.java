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


    WebDriver driver = new FirefoxDriver();

    private static WebElement element = null;



    public static WebElement Zebra(WebDriver driver){

        element = driver.findElement(By.id("line_item_quantity_zebra"));

        return element;

    }

    public static WebElement Lion(WebDriver driver){
        element = driver.findElement(By.id("line_item_quantity_lion"));

        return element;

    }

    public static WebElement Elephant(WebDriver driver){
        element = driver.findElement(By.id("line_item_quantity_elephant"));

        return element;
    }

    public static WebElement Giraffe(WebDriver driver){
        element = driver.findElement(By.id("line_item_quantity_giraffe"));

        return element;
    }

    public static Select State(WebDriver driver){
        Select dropdown = new Select (driver.findElement(By.name("state")));

        return dropdown ;

    }

    public static WebElement Checkout(WebDriver driver){
        element = driver.findElement(By.name("commit"));

        return element;
    }






}
