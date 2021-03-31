package Exercises.P03_ShoppingSpree_v2;
/* @created by Ch.B. on 16-Mar-21 - 21:33 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<String, Person> people = new LinkedHashMap<>();
    private static final Map<String, Product> products = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            setObject(scanner, "Person");
            setObject(scanner, "Product");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        String input;

        while (!"END".equals(input = scanner.nextLine())) {
            try {
                String[] tokens = input.split("\\s+");
                people.get(tokens[0]).buyProduct(products.get(tokens[1]));
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        people.values().forEach(System.out::println);
    }

    private static void setObject(Scanner scanner, String clazz) {
        String[] input = scanner.nextLine().split(";");
        Arrays.stream(input).map(s -> s.split("=")).forEach(data -> {
            var object = clazz.equals("Person")
                    ? people.put(data[0].trim(), new Person(data[0].trim(), Double.parseDouble(data[1].trim())))
                    : products.put(data[0].trim(), new Product(data[0].trim(), Double.parseDouble(data[1].trim())));
        });
    }
}
