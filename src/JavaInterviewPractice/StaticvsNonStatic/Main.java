package JavaInterviewPractice.StaticvsNonStatic;

public class Main {
    public static void main(String[] args) {
        // creating the dice object
        System.out.println(Dice.sidesOfDice);
        Dice d = new Dice();
        Dice otherDice = new Dice();

        //rolling a 6 sided die
        System.out.println();
        System.out.println("Six Sides");

        for(int i = 0; i < 10; i++) {
            System.out.println("First die: " + d.roll());
            System.out.println("Second Die: " + otherDice.roll());
        }

        //Retrieving face value
        System.out.println();
        System.out.println("Face value: " + d.getFaceValue());
        System.out.println("Face value " + otherDice.getFaceValue());

        //things that are wrong
        // d.sidesOfDice

    }
}
