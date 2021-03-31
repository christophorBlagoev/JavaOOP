package Exercises.p06_Animals.animals;
/* @created by Ch.B. on 19-Mar-21 - 23:28 */

public class Kitten extends Cat{

    final static String KITTEN_GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, KITTEN_GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
