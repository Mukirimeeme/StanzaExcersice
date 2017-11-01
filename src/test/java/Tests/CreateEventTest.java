package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.*;
import Pages.LandingPage;
import Pages.CalendarPage;
import Pages.SignInPage;
import Domain.UserData;

/**
 * Created by innocentmeeme on 11/1/17.
 */
public class CreateEventTest {

    public LandingPage landingPage;
    public CalendarPage calendarPage;
    public SignInPage signInPage;


    private static WebDriver driver = null;



    @Before
    public void beforeMethod() {

        driver = new FirefoxDriver();
        driver.get("https:www.google.com");

    }

    @After
    public void AfterMethod(){
        driver.quit();
    }

    @Test
    public void createEvent(){
        landingPage.Apps(driver).click();
        landingPage.CalendarApp(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signInPage.AddEmail(driver).sendKeys(String.valueOf(UserData.EmailAddress));
        signInPage.GoToNext(driver).click();
        signInPage.EnterPassword(driver).sendKeys(String.valueOf(UserData.Password));
        signInPage.SingIn(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        calendarPage.CreateEventButton(driver).click();
        calendarPage.EnterEventName(driver).sendKeys(String.valueOf(UserData.Event));
        calendarPage.EnterStartDate(driver).clear();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.EnterStartDate(driver).sendKeys(String.valueOf(UserData.StartDate));
        calendarPage.EnterStartTime(driver).clear();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.EnterStartTime(driver).sendKeys(String .valueOf(UserData.StartTime));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.EnterEndTime(driver).clear();
        calendarPage.EnterEndTime(driver).sendKeys(String.valueOf(UserData.EndTime));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.EnterLocation(driver).sendKeys(String.valueOf(UserData.Location));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.EnterDescription(driver).sendKeys(String.valueOf(UserData.Description));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.SaveEvent(driver).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);








    }
}
