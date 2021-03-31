package Exercise.P03_WildFarm;
/* @created by Ch.B. on 28-Mar-21 - 18:43 */

public class Mouse extends Mammal{

    public Mouse(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        } else {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }
}
