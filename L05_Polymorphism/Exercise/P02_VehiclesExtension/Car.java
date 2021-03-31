package Exercise.P02_VehiclesExtension;
/* @created by Ch.B. on 25-Mar-21 - 21:49 */

public class Car extends Vehicle{

    private static final double SUMMER_CORRECTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double fuelCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_CORRECTION, fuelCapacity);
    }
}
