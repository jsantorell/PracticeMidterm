/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Reports;

import midterm.BusinessInformation.*;
import midterm.Customer.Customer;
import midterm.Database.Product;
import midterm.Receipt.LineItemData;
import midterm.Receipt.LineItem;

/**
 *
 * @author jerem
 */
public interface Reporter {

    public abstract void getProductsList(Product p);

    public abstract void getLineItems(LineItem p);

    public abstract void printReceipt(LineItemData lI, Customer c, BusinessInformation bI, String thankYouMessage);
}
