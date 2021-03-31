package Exercises.p06_Animals.animals;
/* @created by Ch.B. on 19-Mar-21 - 23:29 */

public class Tomcat extends Cat{

    final static String TOMCAT_GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age, TOMCAT_GENDER);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
