package Tests;

import Domain.ProductPrices;
import Domain.Taxes;
import Domain.TestData;
import Pages.LandingPage;
import Pages.RealCheckoutPage;
import Pages.TaxCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

/**
 * Created by imeeme on 10/1/16.
 */
public class JungleTests extends LandingPage {

    public LandingPage landingPage;
    public RealCheckoutPage realCheckoutPage;
    public TaxCalculator taxCalculator;

    String S = "$";


    WebDriver driver = new FirefoxDriver();


    @Before

    public void beforeMethod() {

        driver.get("https://jungle-socks.herokuapp.com/");

    }



    @Test
    public void AddAllProduct(){
        EnterZebraQuantity(TestData.Zebra);
        EnterLionQuantity(TestData.Lion);
        EnterElephantQuantity(TestData.Elephant);
        EnterGiraffeQuantity(TestData.Giraffe);
        EnterState(TestData.State);
        Checkout();
       assertEquals(("$" + ExpectedTotal()),Total());


    }
    @Test
    public void InvalidState(){
        EnterZebraQuantity(TestData.InvalidZebra);
        EnterGiraffeQuantity(TestData.Giraffe);
        Checkout();
        assertEquals("We've been notified about this issue and we'll take a look at it shortly.",(InvalidStateError()));

    }


    public double SalesTax(String State) {
        String stateCA ="CA";
        String stateNY = "NY";
        String stringMN = "MN";


        if (TestData.State.equals(stateCA)){
            double CATaxes = (Subtotal() * Taxes.CATax);
            return CATaxes;

        }
        else if(TestData.State.equals(stateNY)){
            double NYTaxes = Subtotal()* Taxes.NYTax;
            return NYTaxes;
        }

        else  if (TestData.State.equals(stringMN)){
            double MNTaxes= Subtotal() * Taxes.MNYax;
            return MNTaxes;
        }

        else {
            double OtherTaxes = Subtotal() * Taxes.OtherTax;
            return OtherTaxes;
        }




    }
    public double Subtotal (){
        double ST = ZebraCost() + ElephantCost() + GiraffeCost() + LionCost();

        return ST;
    }

    public int ZebraCost(){
        int Zc = TestData.Zebra * ProductPrices.ZebraPrice;

        return Zc;

    }
    public int ElephantCost(){
        int Ec = TestData.Elephant * ProductPrices.ElephantPrice;

        return Ec;
    }
    public int GiraffeCost(){
        int Gc = TestData.Giraffe * ProductPrices.GiraffePrice;

        return Gc;
    }
    public int LionCost(){
        int Lc = TestData.Lion * ProductPrices.LionPrice;

        return Lc;

    }
    public String Total(){
        WebElement tdElement = driver.findElement(By.id("total"));

        String descriptionText = tdElement.getText();

        return descriptionText;
    }

    public String TotalTaxes(){
        WebElement tdElement = driver.findElement(By.id("taxes"));

        String descriptionText = tdElement.getText();


        return descriptionText;


    }

    public String ExpectedTotal(){

        double d =(Subtotal() + SalesTax(TestData.State));
        DecimalFormat df = new DecimalFormat("#0.00");

        String  Et = (String.valueOf((df.format(d))));


        return Et;



    }

    public void EnterZebraQuantity(int Zebra) {


        driver.findElement(By.id("line_item_quantity_zebra")).sendKeys(String.valueOf(Zebra));

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
        new Select (driver.findElement(By.name("state"))).selectByValue(State);

    }
    public void Checkout(){
        driver.findElement(By.name("commit")).click();
    }

    public String InvalidStateError(){
       WebElement PElement = driver.findElement(By.xpath("/ html/body/div/p"));
        String Message = PElement.getText();

        return Message;

    }

    @After
    public void AfterMethod(){
        driver.quit();
    }

}
