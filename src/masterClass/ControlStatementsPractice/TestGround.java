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

        for (int i = 0; i < 10; i++) {

        }

        String[] cheese = {"American", "Gouda", "Swiss Cheese", "Havarti"};
        for(String i :cheese) {
            System.out.println(i);
        }

        String[] games = {"Halo", "CoD", "BFV", "The Medium", "WoW"};

        for (String j : games
             ) {
            System.out.println(j);
        }

        String[] dumplings = {"Shumai", "Dumplings", "Pork Shumai", "Shrimp Shumai"};


    }

}

