package Exercise.P01_DefineAnInterfacePerson;
/* @created by Ch.B. on 23-Mar-21 - 18:51 */

public class Citizen implements Person{

    private String name;
    private int age;

    public Citizen(String name, int age){
        this.name = name;
        this.age = age;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
