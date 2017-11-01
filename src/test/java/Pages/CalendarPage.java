package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by innocentmeeme on 11/1/17.
 */
public class CalendarPage {
    private static WebElement element = null;


    public static WebElement CreateEventButton(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[1]/div[1]/div/div[1]/div/div/div/div[2]"));

        return element;
    }


    public static WebElement EnterEventName(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[2]/input"));

        return element;
    }

    public static WebElement EnterStartDate(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[3]/div[1]/div/span[1]/span[1]/span[1]/span[1]/input[1]"));

        return element;
    }

    public static WebElement EnterStartTime(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[3]/div[1]/div/span[1]/span[1]/span[1]/span[1]/input[2]"));

        return element;
    }


    public static WebElement EnterEndTime(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[3]/div[1]/div/span[1]/span[1]/span[4]/span[1]/input[1]"));

        return element;
    }

    public static WebElement EnterEndDate(WebDriver driver){

        element = driver.findElement(By.id("::35-ed"));

        return element;
    }

    public static WebElement EnterLocation(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[4]/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td/div[1]/div/input"));

        return element;
    }

    public static WebElement EnterDescription(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[4]/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td/div/div/textarea"));

        return element;
    }

    public static WebElement SaveEvent(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[4]/div[3]/div[1]/div/div/div[1]/div[3]/div/div/div/div/div[2]"));

        return element;
    }

}
