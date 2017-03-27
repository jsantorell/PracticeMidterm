/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Discount;

/**
 *
 * @author jerem
 */
public class PercentDiscount implements Discount {

    private double discount;

    public PercentDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public final double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
