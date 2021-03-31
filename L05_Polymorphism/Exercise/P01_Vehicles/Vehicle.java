package Exercise.P01_Vehicles;
/* @created by Ch.B. on 25-Mar-21 - 21:47 */

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    protected Vehicle (double fuelQuantity, double fuelConsumption) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void drive(double kilometers) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (this.fuelQuantity < this.fuelConsumption * kilometers) {
            System.out.println(String.format("%s needs refueling", getClass().getSimpleName()));
        } else {
            this.fuelQuantity -= this.fuelConsumption * kilometers;
            System.out.println(String.format("%s travelled %s km", getClass().getSimpleName(), decimalFormat.format(kilometers)));
        }
    }

    protected void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
