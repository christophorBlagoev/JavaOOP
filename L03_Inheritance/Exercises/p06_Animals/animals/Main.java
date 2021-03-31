package Exercises.p06_Animals.animals;
/* @created by Ch.B. on 19-Mar-21 - 23:27 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List< Animal > animals = new ArrayList<>();
        String animalType;

        while (!"Beast!".equals(animalType = scanner.nextLine())) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            try {
                switch (animalType) {
                    case "Dog":
                        animals.add(new Dog(name, age, gender));
                        break;
                    case "Frog":
                        animals.add(new Frog(name, age, gender));
                        break;
                    case "Cat":
                        animals.add(new Cat(name, age, gender));
                        break;
                    case "Kitten":
                        animals.add(new Kitten(name, age));
                        break;
                    case "Tomcat":
                        animals.add(new Tomcat(name, age));
                        break;
                }

            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
        animals.forEach(System.out::println);
    }
}
