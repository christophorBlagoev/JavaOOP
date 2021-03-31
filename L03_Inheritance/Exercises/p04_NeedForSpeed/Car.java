package Exercises.p04_NeedForSpeed;
/* @created by Ch.B. on 19-Mar-21 - 19:58 */

public class Car extends Vehicle{

    final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
