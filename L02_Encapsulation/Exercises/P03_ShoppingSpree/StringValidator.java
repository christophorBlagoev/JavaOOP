package Exercises.P03_ShoppingSpree;
/* @created by Ch.B. on 16-Mar-21 - 19:08 */

public class StringValidator {

    private StringValidator() {
    }

    public static boolean isValidName(String name) {
        return name != null || !name.trim().isEmpty();
    }
}
