package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 21:13 */

import java.math.BigDecimal;

public class Food extends Product{

    protected double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return this.grams;
    }
}
