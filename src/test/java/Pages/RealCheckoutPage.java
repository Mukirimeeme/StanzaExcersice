package Pages;

import Domain.ProductPrices;
import Domain.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DecimalFormat;

/**
 * Created by imeeme on 9/30/16.
 */
public class RealCheckoutPage extends LandingPage {
    WebDriver driver = new FirefoxDriver();
    private static WebElement element = null;


    public static int ZebraCost(){
        int Zc = TestData.Zebra * ProductPrices.ZebraPrice;

        return Zc;

    }
    public static int CheckZebra(WebDriver driver){
        WebElement price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td[2]"));

        String PriceText = price.getText();

        WebElement Quantity = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td[3]"));

        String QuantityText = Quantity.getText();

       int Zt = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Zt;


    }
    public static int ElephantCost(){
        int Ec = TestData.Elephant * ProductPrices.ElephantPrice;

        return Ec;
    }

    public static int CheckElephant(WebDriver driver){
        WebElement price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[4]/td[2]"));

        String PriceText = price.getText();

        WebElement Quantity = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[4]/td[3]"));

        String QuantityText = Quantity.getText();

        int Et = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Et;


    }

    public static int GiraffeCost(){
        int Gc = TestData.Giraffe * ProductPrices.GiraffePrice;

        return Gc;
    }

    public static int CheckGiraffe(WebDriver driver){
        WebElement Price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[5]/td[2]"));

        String PriceText = Price.getText();

        WebElement Quality = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[5]/td[3]"));

        String QuantityText = Quality.getText();

        int Gt = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Gt;



    }
    public static int LionCost(){
        int Lc = TestData.Lion * ProductPrices.LionPrice;

        return Lc;

    }

    public static int CheckLion(WebDriver driver){
        WebElement Quantity = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[3]/td[2]"));

        String QuantityText = Quantity.getText();

        WebElement price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[3]/td[3]"));

        String PriceText = price.getText();

        int Lt = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Lt;


    }

    public static int Subtotal (){
        int ST = ZebraCost() + ElephantCost() + GiraffeCost() + LionCost();

        return ST;
    }

    public static double TotalTaxes(WebDriver driver){
        WebElement tdElement = driver.findElement(By.id("taxes"));

        String descriptionText = tdElement.getText();

        int Tt = Integer.parseInt(descriptionText);

        return Tt;


    }

    public static String  ExpectedTotal(){
        double d =(Subtotal() +TaxCalculator.SalesTax(TestData.State));
        DecimalFormat df = new DecimalFormat("#0.00");

        String  Et = (String.valueOf((df.format(d))));


        return Et;

    }



    public static String Total(WebDriver driver){
        WebElement tdElement = driver.findElement(By.id("total"));

        String descriptionText = tdElement.getText();

        return descriptionText;
    }

    public static String InvalidStateError(WebDriver driver){
        WebElement PElement = driver.findElement(By.xpath("/ html/body/div/p"));
        String Message = PElement.getText();

        return Message;

    }
}
