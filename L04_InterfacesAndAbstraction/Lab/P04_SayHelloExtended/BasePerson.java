package Lab.P04_SayHelloExtended;
/* @created by Ch.B. on 22-Mar-21 - 21:33 */

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
