/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Reports;

import java.text.DecimalFormat;
import midterm.BusinessInformation.*;
import midterm.Receipt.*;
import midterm.Customer.Customer;
import midterm.Database.Product;

/**
 *
 * @author jerem
 */
public class ConsoleReporter implements Reporter {

    @Override
    public final void getProductsList(Product p) {

        System.out.print(p.getProductID() + " ");
        System.out.print(p.getProductName() + " ");
        System.out.println(p.getProductPrice());

    }

    @Override
    public final void getLineItems(LineItem p) {

        System.out.print(p.getName() + "    ");
        System.out.print(p.getPrice() + "      ");
        System.out.print(p.getQuantity() + "   ");
        System.out.print(p.getDiscountAmountInDollars() + "        ");
        System.out.println(p.getSubtotal());

    }

    @Override
    public void printReceipt(LineItemData lI, Customer c, BusinessInformation bI, String thankYouMessage) {

        //Could probably make this its own method.<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        double total = lI.addUpTotalBeforeTax();
        double tax = total * 0.05;//Make the tax less ridged.
        double grandTotal = total + tax;
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedSubtotal = df.format(total);
        String formattedTax = df.format(tax);
        String formattedGrandTotal = df.format(grandTotal);
        //To Here<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        System.out.println(bI.getBuisnessName());
        System.out.println(bI.getAddress() + " " + bI.getCity() + " " + bI.getState() + " " + bI.getZip());
        System.out.println(bI.getPhoneNumber());
        System.out.println("Customer: " + c.getName());
        System.out.println("--------------------------------");
        System.out.println("Product Name                  Price    Qty   Discount   Subtotal");
        lI.getLineItems();
        System.out.println("--------------------------------");
        System.out.println("Total: $" + formattedSubtotal);
        System.out.println("Tax: " + formattedTax);
        System.out.println("Grand Total: " + formattedGrandTotal);
        System.out.println("Paid with: " + c.getCustomerID());
        System.out.println("--------------------------------");
        System.out.println(thankYouMessage);

    }

}
