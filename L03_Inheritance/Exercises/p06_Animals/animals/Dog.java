package Exercises.p06_Animals.animals;
/* @created by Ch.B. on 19-Mar-21 - 23:27 */

public class Dog extends Animal{

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Woof!";
    }
}
