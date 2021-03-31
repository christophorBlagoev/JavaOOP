package Lab.P02_CarShopExtended;
/* @created by Ch.B. on 22-Mar-21 - 19:12 */

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }



    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + super.getModel() + " sells for " + this.price;
    }
}
