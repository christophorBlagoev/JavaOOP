package Lab.P03_SayHello;
/* @created by Ch.B. on 22-Mar-21 - 21:22 */

public interface Person {

    String getName();

    default String sayHello() {
        return "Hello";
    }
}
