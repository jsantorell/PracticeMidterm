/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Database;

import midterm.Discount.*;
import midterm.Reports.*;

/**
 *
 * @author jerem
 */
public interface ProductInventoryDatabase {

    public abstract void addProduct(String id, String name, double price, Discount discount);

    public abstract void getProducts();

    public abstract double retrievePrice(String productID);

    public abstract double retrieveSubtotal(String productID, int quantity);

    public abstract String retrieveProductName(String productID);

    public abstract void setReporter(Reporter reporter);

    public abstract Reporter getReporter();

    public abstract Discount retrieveDiscount(String productID);
}
