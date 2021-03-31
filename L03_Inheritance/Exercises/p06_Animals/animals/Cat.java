package Exercises.p06_Animals.animals;
/* @created by Ch.B. on 19-Mar-21 - 23:28 */

public class Cat extends Animal{

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Meow meow";
    }
}
