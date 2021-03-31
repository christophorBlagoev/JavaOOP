package Exercises.P05_FootballTeamGenerator;
/* @created by Ch.B. on 16-Mar-21 - 23:48 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map< String, Team > teams = new HashMap<>();
        String input;

        while (!"END".equals(input = scanner.nextLine())) {
            String[] tokens = input.split(";");
            String name = tokens[1];

            switch (tokens[0]) {
                case "Team":
                    try {
                        Team team = new Team(name);
                        teams.putIfAbsent(name, team);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "Add":
                    if (!teams.containsKey(name)) {
                        System.out.println(String.format("Team %s does not exist.", name));
                    } else {
                        try {
                            teams.get(name).addPlayer(new Player(tokens[2]
                                    , Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4])
                                    , Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6])
                                    , Integer.parseInt(tokens[7])));
                        } catch (IllegalArgumentException exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                    break;
                case "Remove":
                    try {
                        teams.get(name).removePlayer(tokens[2]);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "Rating":
                    if (!teams.containsKey(name)) {
                        System.out.println(String.format("Team %s does not exist.", name));
                    } else {
                        System.out.println(String.format("%s - %.0f", name, teams.get(name).getRating()));
                    }
                    break;
            }
        }
    }
}
