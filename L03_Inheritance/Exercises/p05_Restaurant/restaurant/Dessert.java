package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 22:57 */

import java.math.BigDecimal;

public class Dessert extends Food{

    protected double calories;

    public Dessert(String name, BigDecimal price, double grams, double calories){
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return this.calories;
    }
}
