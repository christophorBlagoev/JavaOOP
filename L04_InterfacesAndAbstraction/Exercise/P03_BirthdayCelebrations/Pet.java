package Exercise.P03_BirthdayCelebrations;
/* @created by Ch.B. on 23-Mar-21 - 19:22 */

public class Pet implements Animal, Birthable{

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }
}
