package Exercises.P05_JediGalaxyWhitClass;

import java.util.Scanner;

public class Main extends Galaxy{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createGalaxy(scanner.nextLine());
        String command;

        while (!"Let the Force be with you".equals(command = scanner.nextLine())) {
            evilStartMove(scanner.nextLine());
            playerStartMove(command);
        }

        System.out.println(playerPoints);
    }
}
