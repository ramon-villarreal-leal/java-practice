package masterClass;

public class Operators {



    public static void main(String[] args) {
        int result = 3; // 1 + 2 =3
        int previousResult;
        result = result * 10;

        result++;

        result--;

        result += 2;

        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("No high score!!!! ");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than the second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }
    }
}
