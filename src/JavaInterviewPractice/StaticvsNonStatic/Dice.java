package JavaInterviewPractice.StaticvsNonStatic;

import java.util.Random;

public class Dice {
    static int sidesOfDice =6;
    int faceValue = 0;

    public int roll() {
        Random rand = new Random();
        this.faceValue = rand.nextInt(sidesOfDice) + 1;
        return this.faceValue;
    }

    public static void changeNumberOfSides(int newNumberOfSides) {

        Dice.sidesOfDice = newNumberOfSides;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}
