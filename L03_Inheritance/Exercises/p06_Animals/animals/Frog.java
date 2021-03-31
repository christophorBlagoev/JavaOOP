package Exercises.p06_Animals.animals;
/* @created by Ch.B. on 19-Mar-21 - 23:28 */

public class Frog extends Animal{

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Ribbit";
    }
}
