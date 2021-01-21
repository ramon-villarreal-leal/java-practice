package masterClass.ControlStatementsPractice;

public class Main {
    public static void main(String[] args) {
        boolean gameOn = true;
        int score = 6000;
        int levelComplete = 5;
        int bonusLevel = 100;

        if(score < 4000 && score > 1500) {
            System.out.println("Your score is 6000");
            System.out.println("This runs");
        } else if(score > 2000) {
            System.out.println("Score was greater than 2000");
        } else {
            System.out.println("condition false");
            System.out.println("Part of condition");
        }
    }
}
