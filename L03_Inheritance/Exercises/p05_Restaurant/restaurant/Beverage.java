package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 21:17 */

import java.math.BigDecimal;

public class Beverage extends Product{

    protected double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters){
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return this.milliliters;
    }
}
