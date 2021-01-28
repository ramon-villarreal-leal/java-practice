package masterClass.ControlStatementsPractice;

public class Main {
    public static void main(String[] args) {
        boolean gameOn = true;
        int score = 6000;
        int levelComplete = 5;
        int bonusLevel = 100;
        calculateGameScore(true, 1000, levelComplete, bonusLevel);
//
//        if(score < 4000 && score > 1500) {
//            System.out.println("Your score is 6000");
//            System.out.println("This runs");
//        } else if(score > 2000) {
//            System.out.println("Score was greater than 2000");
//        } else {
//            System.out.println("condition false");
//            System.out.println("Part of condition");
//        }
        // Scope of Java code and deals with accessbility!
        if(gameOn) {
            int finalScoreDude = score + (levelComplete * bonusLevel);
            System.out.println("The final score is " + finalScoreDude);
        } else {
            System.out.println("Game over Bromigo!!!!");
        }

        boolean newGame = true;
        int newScore = 700;
        int newLevelComplete = 8;
        int newBonusLevel = 400;

        if(newGame) {
            int newFinalScoreDude = newScore + (newLevelComplete * newBonusLevel);
            System.out.println("the new final score is " + newFinalScoreDude);
        } else {
            System.out.printf("Game over man!");
        }




    }


    // Parameters defined in section of new method
    public static void calculateGameScore(boolean gameOn, int score, int levelComplete, int bonusLevel) {
        boolean gameOn = true;
        int score = 6000;
        int levelComplete = 5;
        int bonusLevel = 100;

        if(score < 4000 && score > 1500) {
            System.out.println("Your score is 6000");
            System.out.println("This runs");
        } else if(score > 2000) {
            System.out.println("Score was greater than 2000");

        } else if(score < 1000){
            System.out.println("Score was less than 1000");
        }
        else {
            System.out.println("condition false");
            System.out.println("Part of condition");
            System.out.println("Scope defined");
        }

    }

}
