package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 22:59 */

import java.math.BigDecimal;

public class Salmon extends MainDish{

    final static double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price, double grams){
        super(name, price, SALMON_GRAMS);
    }
}
