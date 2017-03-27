/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Receipt;

import java.text.DecimalFormat;
import midterm.Database.*;
import midterm.Discount.*;

/**
 *
 * @author jerem
 */
public class LineItem {

    private ProductInventoryDatabase pID;
    private String productID;
    private int quantity;
    private Discount productDiscount;

    public LineItem(ProductInventoryDatabase pID, String productID, int quantity) {
        this.pID = pID;
        this.productID = productID;
        this.quantity = quantity;

    }

    public final String getDiscountAmountInDollars() {
        double subtotal = pID.retrieveSubtotal(productID, quantity) - (pID.retrieveSubtotal(productID, quantity) * pID.retrieveDiscount(productID).getDiscount());
        double discountAmount = pID.retrieveSubtotal(productID, quantity) - subtotal;
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedSubtotal = df.format(discountAmount);

        return formattedSubtotal;
    }

    public final String getSubtotal() {
        double subtotal = pID.retrieveSubtotal(productID, quantity) - (pID.retrieveSubtotal(productID, quantity) * pID.retrieveDiscount(productID).getDiscount());

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedSubtotal = df.format(subtotal);

        return formattedSubtotal;
    }

    public final String getName() {
        return pID.retrieveProductName(productID);
    }

    public final ProductInventoryDatabase getpID() {
        return pID;
    }

    public void setpID(ProductInventoryDatabase pID) {
        this.pID = pID;
    }

    public final String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public final int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final double getPrice() {

        return pID.retrievePrice(productID);
    }

    public final Discount getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(Discount productDiscount) {
        this.productDiscount = productDiscount;
    }

}
