/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Database;

import midterm.Discount.*;

/**
 *
 * @author jerem
 */
public class Product {

    private String productID;
    private String productName;
    private double productPrice;
    private Discount discount;

    public Product(String productID, String productName, double productPrice, Discount discount) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.discount = discount;
    }

    public final String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public final double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}
