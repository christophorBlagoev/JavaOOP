package Exercise.P01_Vehicles;
/* @created by Ch.B. on 25-Mar-21 - 21:59 */

public class Truck extends Vehicle {
    private static final double SUMMER_CORRECTION = 1.6;
    private static final double TANK_CORRECTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_CORRECTION);
    }

    @Override
    protected void refuel(double liters) {
        super.refuel(liters * TANK_CORRECTION);
    }
}
