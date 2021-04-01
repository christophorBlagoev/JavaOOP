package Lab.P02_GettersAndSetters;
/* @created by Ch.B. on 01-Apr-21 */

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter(current -> current.getName().startsWith("get"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(getter -> System.out.printf("%s will return class %s%n"
                        , getter.getName(), getter.getReturnType().getName()));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter(current -> current.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(setter -> System.out.printf("%s and will set field of class %s%n"
                        , setter.getName(), setter.getParameters()[0].getType().getName()));
    }
}
