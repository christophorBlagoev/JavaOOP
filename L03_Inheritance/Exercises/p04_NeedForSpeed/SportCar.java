package Exercises.p04_NeedForSpeed;
/* @created by Ch.B. on 19-Mar-21 - 20:02 */

public class SportCar extends Car{

    final static double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
