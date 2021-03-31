package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 23:03 */

import java.math.BigDecimal;

public class Cake extends Dessert{

    final static double CAKE_GRAMS = 250;
    final static double CAKE_CALORIES = 1000;
    final static BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String name){
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
