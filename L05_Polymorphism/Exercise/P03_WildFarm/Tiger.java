package Exercise.P03_WildFarm;
/* @created by Ch.B. on 28-Mar-21 - 19:09 */

public class Tiger extends Felime{

    public Tiger(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
        } else {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }
}
