package Lab.P05_BorderControl;
/* @created by Ch.B. on 22-Mar-21 - 22:26 */

public class Citizen implements Identifiable{
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }
}
