package Exercises.P05_JediGalaxyWhitClass;

import java.util.Arrays;

public class Galaxy {
    public static int[][] matrix;
    public static long playerPoints = 0;

    public static void createGalaxy(String input) {
        int[] size = readArray(input);
        matrix = new int[size[0]][size[1]];
        int value = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = value++;
            }
        }
    }

    public static void playerStartMove(String input) {
        int[] index = readArray(input);
        int row = index[0];
        int col = index[1];
        while (row >= 0 && col < matrix[0].length) {
            if (row < matrix.length && col >= 0) {
                playerPoints += matrix[row][col];
            }
            row--;
            col++;
        }
    }

    public static void evilStartMove(String input) {
        int[] index = readArray(input);
        int row = index[0];
        int col = index[1];
        while (row >= 0 && col >= 0) {
            if (row < matrix.length && col < matrix[row].length) {
                matrix[row][col] = 0;
            }
            row--;
            col--;
        }
    }

    private static int[] readArray(String input) {
        return Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
