package rpgGame;

public class Game {

    private int score;
    private int potions;
    private int upgradeWeapon;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPotions() {
        return potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }

    public int getUpgradeWeapon() {
        return upgradeWeapon;
    }

    public void setUpgradeWeapon(int upgradeWeapon) {
        this.upgradeWeapon = upgradeWeapon;
    }

    public Game(int score, int potions, int upgradeWeapon) {
        this.score = score;
        this.potions = potions;
        this.upgradeWeapon = upgradeWeapon;
    }

    public static void main(String[] args) {
        Hero player1 = new Hero();
        Weapon p1 = new Weapon();

        if(player1.equals(p1.getAxe())) {
            System.out.println("You're a Barbarian!!!");
        } else {
            System.out.println("nope");
        }
    }
}
