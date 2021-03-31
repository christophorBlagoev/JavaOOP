package Exercise.P03_WildFarm;
/* @created by Ch.B. on 28-Mar-21 - 18:30 */

public abstract class Animal {
    private String animalType;
    private String animalName;
    private double animalWeight;
    private int foodEaten;

    protected Animal(String animalType, String animalName, double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
