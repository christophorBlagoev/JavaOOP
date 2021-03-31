package Exercise.P03_BirthdayCelebrations;
/* @created by Ch.B. on 23-Mar-21 - 19:18 */

public class Robot implements Machine, Identifiable{

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
