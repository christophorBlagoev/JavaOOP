package Lab.P03_SayHello;
/* @created by Ch.B. on 22-Mar-21 - 21:23 */

public class Chinese implements Person{
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
