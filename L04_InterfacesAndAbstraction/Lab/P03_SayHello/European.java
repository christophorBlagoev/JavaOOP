package Lab.P03_SayHello;
/* @created by Ch.B. on 22-Mar-21 - 21:23 */

public class European implements Person{

    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
