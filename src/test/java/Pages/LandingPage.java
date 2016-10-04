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


    /*public void Website(){

        driver.get("https://jungle-socks.herokuapp.com/");

    }

    public void EnterZebreQuantity() {


        driver.findElement(By.id("line_item_quantity_zebra")).sendKeys(String.valueOf(TestData.Zebra));

    }

    public void EnterLionQuantity(int lion) {


        driver.findElement(By.id("line_item_quantity_lion")).sendKeys(String .valueOf(lion));

    }
    public void EnterElephantQuantity(int Elephant){

        driver.findElement(By.id("line_item_quantity_elephant")).sendKeys(String.valueOf(Elephant));
    }

    public void EnterGiraffeQuantity(int Giraffe){

        driver.findElement(By.id("line_item_quantity_giraffe")).sendKeys(String.valueOf(Giraffe));
    }

    public void EnterState(String State){
        driver.findElement(By.name("state")).sendKeys(State);
        driver.findElement(By.name("state"));
        new Select (driver.findElement(By.name("state"))).selectByValue(State);

    }*/



}
