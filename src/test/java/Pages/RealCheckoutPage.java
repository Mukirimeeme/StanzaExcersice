package Pages;

import Domain.ProductPrices;
import Domain.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by imeeme on 9/30/16.
 */
public class RealCheckoutPage extends LandingPage {
    WebDriver driver = new FirefoxDriver();

    public int ZebraCost(){
        int Zc = TestData.Zebra * ProductPrices.ZebraPrice;

        return Zc;

    }
    public int CheckZebra(){
        WebElement price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td[2]"));

        String PriceText = price.getText();

        WebElement Quantity = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td[3]"));

        String QuantityText = Quantity.getText();

       int Zt = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Zt;


    }
    public int ElephantCost(){
        int Ec = TestData.Elephant * ProductPrices.ElephantPrice;

        return Ec;
    }

    public int CheckElephant(){
        WebElement price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[4]/td[2]"));

        String PriceText = price.getText();

        WebElement Quantity = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[4]/td[3]"));

        String QuantityText = Quantity.getText();

        int Et = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Et;


    }

    public int GiraffeCost(){
        int Gc = TestData.Giraffe * ProductPrices.GiraffePrice;

        return Gc;
    }

    public int CheckGiraffe(){
        WebElement Price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[5]/td[2]"));

        String PriceText = Price.getText();

        WebElement Quality = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[5]/td[3]"));

        String QuantityText = Quality.getText();

        int Gt = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Gt;



    }
    public int LionCost(){
        int Lc = TestData.Lion * ProductPrices.LionPrice;

        return Lc;

    }

    public int CheckLion(){
        WebElement Quantity = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[3]/td[2]"));

        String QuantityText = Quantity.getText();

        WebElement price = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[3]/td[3]"));

        String PriceText = price.getText();

        int Lt = Integer.parseInt(PriceText) * Integer.parseInt(QuantityText);

        return Lt;


    }

    public int Subtotal (){
        int ST = ZebraCost() + ElephantCost() + GiraffeCost() + LionCost();

        return ST;
    }

    public double TotalTaxes(){
        WebElement tdElement = driver.findElement(By.id("taxes"));

        String descriptionText = tdElement.getText();

        int Tt = Integer.parseInt(descriptionText);

        return Tt;


    }

    public String Total(){
        WebElement tdElement = driver.findElement(By.id("total"));

        String descriptionText = tdElement.getText();

        return descriptionText;
    }
}
