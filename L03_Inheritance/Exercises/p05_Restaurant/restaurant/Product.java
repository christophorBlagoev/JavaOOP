package Exercises.p05_Restaurant.restaurant;
/* @created by Ch.B. on 19-Mar-21 - 21:32 */

import java.math.BigDecimal;

public class Product {

    protected String name;
    protected BigDecimal price;

    public Product(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
