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
public class QuantityDiscount implements Discount {

    private double discount;

    public QuantityDiscount(int discount, int minQty) {

        double dis = ((discount / minQty) * .1);

        this.discount = dis;
    }

    @Override
    public final double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
