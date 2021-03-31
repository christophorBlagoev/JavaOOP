package Exercise.P02_VehiclesExtension;
/* @created by Ch.B. on 25-Mar-21 - 21:46 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] carInput = readInput(scanner);
        Vehicle car = new Car(carInput[0], carInput[1], carInput[2]);

        double[] truckInput = readInput(scanner);
        Vehicle truck = new Truck(truckInput[0], truckInput[1], truckInput[2]);

        double[] busInput = readInput(scanner);
        Bus bus = new Bus(busInput[0], busInput[1], busInput[2]);

        Map< String, Vehicle > vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicle = tokens[1];
            double amount = Double.parseDouble(tokens[2]);

            switch (command) {
                case "Drive":
                    vehicles.get(vehicle).drive(amount);
                    break;
                case "Refuel":
                    try {
                        vehicles.get(vehicle).refuel(amount);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "DriveEmpty":
                    bus.setEmpty(false);
                    bus.drive(amount);
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static double[] readInput(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
