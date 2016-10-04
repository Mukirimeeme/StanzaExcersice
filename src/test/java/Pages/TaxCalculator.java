package Pages;

import Domain.Taxes;
import Domain.TestData;

/**
 * Created by imeeme on 9/30/16.
 */
public class TaxCalculator extends RealCheckoutPage {


    public static double SalesTax(String State) {
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

}
