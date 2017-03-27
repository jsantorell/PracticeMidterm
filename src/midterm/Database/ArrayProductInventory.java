/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.Database;

import midterm.Discount.*;

/**
 *
 * @author jerem
 */
public class ArrayProductInventory implements ProductInventory {

    @Override
    public final void setInventory(ProductInventoryDatabase dB) {

        //SweatShirts
        dB.addProduct("AG1487", "Northface Sweat Shirt Gray", 49.99, new FlatDiscount());
        dB.addProduct("AG1488", "Northface Sweat Shirt Blue", 49.99, new PercentDiscount(.15));
        dB.addProduct("AG1489", "Northface Sweat Shirt Green", 49.99, new PercentDiscount(.10));
        dB.addProduct("AG1490", "Northface Sweat Shirt Orange", 49.99, new QuantityDiscount(4, 2));

    }

}
