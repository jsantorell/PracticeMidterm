/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Customer;

/**
 *
 * @author jerem
 */
public class Customer {

    private long customerID;
    private String name;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    public final long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
