package masterClass.ControlStatementsPractice;

public class TestGround {
    public static void main(String[] args) {
        boolean game1 = true;
        int score1 = 700;
        int levelComplete = 30;
        int bonusLevel = 600;

        if (game1) {
            int finalScoreDude = score1 + (levelComplete * bonusLevel * bonusLevel);
            System.out.println("The final score is " + finalScoreDude);
        } else {
            System.out.println("Game over!!!!");
        }
    }

}

