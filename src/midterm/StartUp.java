/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import midterm.BusinessInformation.BusinessInformation;
import midterm.Discount.*;

/**
 *
 * @author jerem
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BusinessInformation b = new BusinessInformation("Kohl's Retail", "123 Easy St.", "Pewaukee", "WI", "52172", "262.123.4567");
        POS pos = new POS(b, "Thank you for shopping at Kohl's");

        pos.turnOnPOS();

        //Transaction
        //To make a transaction, we should be able to scan/enter a productID, qty and get that product back with price, etc.
        //Furthermore we will need discounts associated to the trans.action.
        try{
        pos.productScanned("AG1487", 1);
        pos.productScanned("AG1488", 4);
        pos.productScanned("AG1489", 3);
        }
        catch(IllegalArgumentException iae){
            throw new IllegalArgumentException(iae.getMessage());
        }
        //Customer
        pos.customerInformationReceived(1234567892, "Jane Smith");

        //End of Customer Creation
        //Print Receipt
        pos.createReceipt();

        //End Receipt
    }

}
