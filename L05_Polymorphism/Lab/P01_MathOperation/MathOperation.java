package Lab.P01_MathOperation;
/* @created by Ch.B. on 24-Mar-21 - 12:01 */

public class MathOperation {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return add(add(a, b), c);
    }

    public static int add(int a, int b, int c, int d) {
        return add(add(a, b, c), d);
    }
}
