package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 22:45 */

import java.math.BigDecimal;

public class Coffee extends HotBeverage{

    final static double COFFEE_MILLILITERS = 50;
    final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);

    private final double caffeine;

    public Coffee(String name, double caffeine){
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return this.caffeine;
    }
}
