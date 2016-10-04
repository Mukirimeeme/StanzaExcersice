package Tests;

import Domain.TestData;
import Pages.LandingPage;
import Pages.RealCheckoutPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by imeeme on 10/3/16.
 */
public class Jungle_Socks_Tests {
    public LandingPage landingPage;
    public RealCheckoutPage realCheckoutPage;
    private static WebDriver driver = null;



    @Before
    public void beforeMethod() {

        //driver=new FirefoxDriver();
        //landingPage.Website();

        driver = new FirefoxDriver();
        driver.get("https://jungle-socks.herokuapp.com/");

    }

    @After
    public void AfterMethod(){
        driver.quit();
    }

    @Test
    public void FirstTest(){
        landingPage.Zebra(driver).sendKeys(String.valueOf(TestData.Zebra));
        landingPage.Lion(driver).sendKeys(String.valueOf(TestData.Lion));
        landingPage.Elephant(driver).sendKeys(String.valueOf(TestData.Elephant));
        landingPage.Giraffe(driver).sendKeys(String.valueOf(TestData.Giraffe));
        landingPage.State(driver).selectByValue(TestData.State);
        landingPage.Checkout(driver).click();

        assertEquals(("$" + realCheckoutPage.ExpectedTotal()),realCheckoutPage.Total(driver));


    }

    @Test
    public void InvalidState(){
        landingPage.Zebra(driver).sendKeys(String.valueOf(TestData.InvalidZebra));
        landingPage.Giraffe(driver).sendKeys(String.valueOf(TestData.Giraffe));
        landingPage.Checkout(driver).click();
        assertEquals("We've been notified about this issue and we'll take a look at it shortly.",(realCheckoutPage.InvalidStateError(driver)));

    }
}
