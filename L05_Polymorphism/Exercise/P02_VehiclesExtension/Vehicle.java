package Exercise.P02_VehiclesExtension;
/* @created by Ch.B. on 25-Mar-21 - 21:47 */

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double fuelCapacity;

    protected Vehicle (double fuelQuantity, double fuelConsumption, double fuelCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setFuelCapacity(fuelCapacity);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
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
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (fuelQuantity + liters > fuelCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
