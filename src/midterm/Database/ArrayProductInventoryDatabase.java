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
public class ArrayProductInventoryDatabase implements ProductInventoryDatabase {

    private Reporter reporter;
    private Product[] products = new Product[0];

    public ArrayProductInventoryDatabase(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public void addProduct(String id, String name, double price, Discount discount) throws IllegalArgumentException{
if (id== null || id.isEmpty()) {
            throw new IllegalArgumentException("No product ID provided");
        }
        Product[] tmpArray = new Product[products.length + 1];
        System.arraycopy(products, 0, tmpArray, 0, products.length);
        products = tmpArray;
        products[products.length - 1] = new Product(id, name, price, discount);

    }

    @Override
    public final double retrievePrice(String productID) throws IllegalArgumentException{
if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("No product ID provided");
        }
        {

            double price = 0.0;
            for (Product p : products) {
                if (p.getProductID().equalsIgnoreCase(productID)) {
                    price = p.getProductPrice();
                }

            }
            return price;

        }

    }

    @Override
    public final double retrieveSubtotal(String productID, int quantity) throws IllegalArgumentException{
        if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("No product ID provided");
        }
        double price = 0.0;
        for (Product p : products) {
            if (p.getProductID().equalsIgnoreCase(productID)) {
                price = p.getProductPrice();
            }

        }
        return price * quantity;

    }

    @Override
    public final String retrieveProductName(String productID) throws IllegalArgumentException{
if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("No product ID provided");
        }
        String name = "";
        for (Product p : products) {
            if (p.getProductID().equalsIgnoreCase(productID)) {
                name = p.getProductName();

            }
        }
        return name;

    }

    @Override
    public final Discount retrieveDiscount(String productID) throws IllegalArgumentException{
if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("No product ID provided");
        }
        Discount discount = null;
        for (Product p : products) {
            if (p.getProductID().equalsIgnoreCase(productID)) {
                discount = p.getDiscount();

            }
        }
        return discount;

    }

    @Override
    public final void getProducts() throws IllegalArgumentException{

        for (Product p : products) {

            this.reporter.getProductsList(p);
        }

    }

    @Override
    public final Reporter getReporter() {
        return reporter;
    }

    @Override
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

}
