/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Database;

/**
 *
 * @author jerem
 */
public class DatabaseCreationService {

    public void putDatabaseTogether(ProductInventoryDatabase p, ProductInventory i) {
        // TODO code application logic here

        i.setInventory(p); //Build Array database
        //    System.out.println("Inventory Set");
        //p.getProducts();//Get a list of products
        //This can be turned on/off in the future.<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //    System.out.println("products list above");
    }

}
