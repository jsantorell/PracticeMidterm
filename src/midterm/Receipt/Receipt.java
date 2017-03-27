/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Receipt;

import midterm.BusinessInformation.*;
import midterm.Customer.Customer;
import midterm.Reports.Reporter;

/**
 *
 * @author jerem
 */
public class Receipt {

    Reporter reporter;
    private ReceiptArrayofPurchasedProducts lineItem;
    private Customer customer;
    private BusinessInformation buisnessInformation;
    private String thankYouMessage;
    private ReceiptArrayofPurchasedProducts raopp;

    public Receipt(Reporter reporter, ReceiptArrayofPurchasedProducts lineItem, BusinessInformation buisnessInformation, String thankYouMessage) {
        this.reporter = reporter;
        this.lineItem = lineItem;
        this.buisnessInformation = buisnessInformation;
        this.thankYouMessage = thankYouMessage;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final BusinessInformation getBuisnessInformation() {
        return buisnessInformation;
    }

    public void setBuisnessInformation(BusinessInformation buisnessInformation) {
        this.buisnessInformation = buisnessInformation;
    }

    public final String getThankYouMessage() {
        return thankYouMessage;
    }

    public void setThankYouMessage(String thankYouMessage) {
        this.thankYouMessage = thankYouMessage;
    }

    public final Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public final ReceiptArrayofPurchasedProducts getLineItem() {
        return lineItem;
    }

    public void setLineItem(ReceiptArrayofPurchasedProducts lineItem) {
        this.lineItem = lineItem;
    }

    public final void printReceipt() {

        this.reporter.printReceipt(lineItem, customer, buisnessInformation, thankYouMessage);

    }

    public ReceiptArrayofPurchasedProducts getRaopp() {
        return raopp;
    }

    public void setRaopp(ReceiptArrayofPurchasedProducts raopp) {
        this.raopp = raopp;
    }

    public void populateCustomerDataForTransaction(int customerID, String name) {

        Customer c = new Customer(customerID, name);
        this.customer = c;
    }

}
