package Exercise.P03_WildFarm;
/* @created by Ch.B. on 28-Mar-21 - 19:04 */

import java.text.DecimalFormat;

public class Cat extends Felime{

    private String breed;

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.getClass().getSimpleName()
        , this.getAnimalName(), this.getBreed()
        , decimalFormat.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}
