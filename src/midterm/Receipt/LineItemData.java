/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Receipt;

import midterm.Reports.Reporter;

/**
 *
 * @author jerem
 */
public class LineItemData {

    private Reporter reporter;
    private LineItem[] lineItems = new LineItem[0];// lineItemData

    public LineItemData(Reporter reporter) {
        this.reporter = reporter;
    }

    public void addLineItem(LineItem p) {

        LineItem[] tmpArray = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tmpArray, 0, lineItems.length);
        lineItems = tmpArray;
        lineItems[lineItems.length - 1] = new LineItem(p.getpID(), p.getProductID(), p.getQuantity());

    }

    public final void getLineItems() {

        for (LineItem p : lineItems) {

            this.reporter.getLineItems(p);
        }

    }

    public final Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public double addUpTotalBeforeTax() {
        double total = 0;
        for (LineItem p : lineItems) {

            total += (p.getPrice() * p.getQuantity());
        }

        return total;

    }

}
