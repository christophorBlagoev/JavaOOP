package Lab.P03_HighQualityMistakes;
/* @created by Ch.B. on 01-Apr-21 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Class< Reflection > clazz = Reflection.class;

        try {
            Method[] declaredMethods = clazz.getDeclaredMethods();

            Set< Method > getters = new TreeSet<>(new MethodComparator());
            Set< Method > setters = new TreeSet<>(new MethodComparator());

            for (Method method : declaredMethods) {
                if (method.getName().contains("get")) {
                    getters.add(method);
                } else if (method.getName().contains("set")) {
                    setters.add(method);
                }
            }

            Arrays.stream(clazz.getDeclaredFields())
                    .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                    .sorted(Comparator.comparing(Field::getName))
                    .forEach(f -> System.out.println(f. getName() + " must be private!"));

            for (Method getter : getters) {
                if (!Modifier.isPublic(getter.getModifiers())){
                    System.out.println(getter.getName() + " have to be public!");
                }
            }

            for (Method setter : setters) {
                if (!Modifier.isPrivate(setter.getModifiers())) {
                    System.out.println(setter.getName() + " have to be private!");
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static class MethodComparator implements Comparator< Method > {

        @Override
        public int compare(Method f, Method s) {
            return f.getName().compareTo(s.getName());
        }
    }
}
