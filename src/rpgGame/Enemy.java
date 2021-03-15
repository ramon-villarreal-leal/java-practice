package rpgGame;

public class Enemy {
    private int attack;
    private int defense;
    private int potions;
    private int shield;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPotions() {
        return potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public Enemy(int attack, int defense, int potions, int shield) {
        this.attack = attack;
        this.defense = defense;
        this.potions = potions;
        this.shield = shield;
    }
}
