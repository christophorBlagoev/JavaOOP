package Exercises.P01_CardSuit;

public class Main {
    public static void main(String[] args) {

        CardSuits[] cardSuits = CardSuits.values();

        System.out.println("Card Suits:");
        for (CardSuits cardSuit : cardSuits) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    cardSuit.ordinal(), cardSuit.name()));
        }
    }
}
