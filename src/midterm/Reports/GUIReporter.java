/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Reports;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import midterm.BusinessInformation.*;
import midterm.Receipt.*;
import midterm.Customer.Customer;
import midterm.Database.Product;

/**
 *
 * @author jerem
 */
public class GUIReporter implements Reporter {

    @Override
    public final void getProductsList(Product p) throws IllegalArgumentException {
        if (p.getProductID() == null || p.getProductID().isEmpty()) {
            throw new IllegalArgumentException();
        }
        JOptionPane.showMessageDialog(null, p.getProductID() + " " + p.getProductName() + " " + p.getProductPrice());

    }

    @Override
    public final void getLineItems(LineItem p) {

        JOptionPane.showMessageDialog(null, p.getName() + "    " + p.getPrice() + "      " + p.getQuantity() + "   " + p.getDiscountAmountInDollars() + "        " + p.getSubtotal());

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

        JOptionPane.showMessageDialog(null, bI.getBuisnessName()
                + "\n " + bI.getAddress() + " " + bI.getCity() + " " + bI.getState() + " " + bI.getZip()
                + "\n" + bI.getPhoneNumber()
                + "\n" + "Customer: " + c.getName()
                + "\n--------------------------------"
                + "\nProduct Name                  Price    Qty   Discount   Subtotal"
                + "\n--------------------------------"
                + "\nTotal: $" + formattedSubtotal
                + "\nTax: " + formattedTax
                + "\nGrand Total: " + formattedGrandTotal
                + "\nPaid with: " + c.getCustomerID()
                + "\n--------------------------------"
                + "\n" + thankYouMessage
        );

    }

}
