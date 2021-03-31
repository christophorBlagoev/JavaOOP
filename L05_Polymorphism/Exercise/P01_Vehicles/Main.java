package Exercise.P01_Vehicles;
/* @created by Ch.B. on 25-Mar-21 - 21:46 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] carInput = readInput(scanner);
        Vehicle car = new Car(carInput[0], carInput[1]);

        double[] truckInput = readInput(scanner);
        Vehicle truck = new Truck(truckInput[0], truckInput[1]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicle = tokens[1];
            double amount = Double.parseDouble(tokens[2]);

            switch (command) {
                case "Drive":
                    if (vehicle.equals("Car")) {
                        car.drive(amount);
                    } else {
                        truck.drive(amount);
                    }
                    break;
                case "Refuel":
                    if (vehicle.equals("Car")) {
                        car.refuel(amount);
                    } else {
                        truck.refuel(amount);
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }

    private static double[] readInput(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
