/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import midterm.BusinessInformation.BusinessInformation;
import midterm.Database.*;
import midterm.Receipt.*;
import midterm.Reports.*;

/**
 *
 * @author jerem
 */
public class POS {

    private BusinessInformation b;

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private Reporter reports = new GUIReporter(); // change how receipts are output

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Set Database
    private ProductInventoryDatabase pID = new ArrayProductInventoryDatabase(reports); //make the database
    private ProductInventory pI = new ArrayProductInventory();
    private DatabaseCreationService p = new DatabaseCreationService();

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private Receipt r;
    private String thankYouMessage;
    private LineItemData s = new LineItemData(reports);

    //FUNCTIONS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    
    public POS(BusinessInformation b, String thankYou) {
        this.b = b;
        this.thankYouMessage = thankYou;
    }

    public final void turnOnPOS() {

        p.putDatabaseTogether(pID, pI);
    }

    public final void productScanned(String productID, int qty) throws IllegalArgumentException{

        if(productID == null || productID.isEmpty()){
        
        throw new IllegalArgumentException("No product ID was entered.");
        }
        
        s.addLineItem(new LineItem(pID, productID, qty));

    }

    public final void customerInformationReceived(int customerID, String name) {
        r = new Receipt(reports, s, b, thankYouMessage);
        r.populateCustomerDataForTransaction(customerID, name);
    }
    
    //GETTERS  AND SETTERS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public final String getThankYouMessage() {
        return thankYouMessage;
    }

    public final void setThankYouMessage(String thankYouMessage) {
        this.thankYouMessage = thankYouMessage;
    }

    public final void createReceipt() {

        r.printReceipt();
    }

    public final BusinessInformation getB() {
        return b;
    }

    public void setB(BusinessInformation b) {
        this.b = b;
    }

    public final Reporter getReports() {
        return reports;
    }

    public void setReports(Reporter reports) {
        this.reports = reports;
    }

    public final ProductInventoryDatabase getpID() {
        return pID;
    }

    public void setpID(ProductInventoryDatabase pID) {
        this.pID = pID;
    }

    public final ProductInventory getpI() {
        return pI;
    }

    public void setpI(ProductInventory pI) {
        this.pI = pI;
    }

    public final DatabaseCreationService getP() {
        return p;
    }

    public void setP(DatabaseCreationService p) {
        this.p = p;
    }

    public final Receipt getR() {
        return r;
    }

    public void setR(Receipt r) {
        this.r = r;
    }

    public final LineItemData getS() {
        return s;
    }

    public void setS(LineItemData s) {
        this.s = s;
    }

}
