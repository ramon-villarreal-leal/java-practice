package masterClass.KeyWordsAndExpressions;

public class Main {

    public static void main(String[] args) {


        // Expressions are building blocks of all Java programs
        //a mile is 1.609344 km
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore == 50) {
            System.out.println("an Expression!");
            System.out.println("Hello Friendo!");
        }

        int score = 200;
        if (score > 100) {
            System.out.println("You got the highj score man!");
        } else {
            System.out.println("No more high score dude");
        }


        int myVariable = 50;
        myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a cool test");
        System.out.println("This is a cooler test" +
                "More test"
        + "Lets goooo");


        int anotherVar = 50;
        myVariable--;
        System.out.println("Another one for the books");

    }
}

