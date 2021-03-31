package Lab.P04_SayHelloExtended;
/* @created by Ch.B. on 22-Mar-21 - 21:34 */

public class Bulgarian extends BasePerson{

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
