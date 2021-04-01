package rpgGame;

public class Druid {
    private int attack;
    private int defense;
    private String Axe;

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

    public String getAxe() {
        return Axe;
    }

    public void setAxe(String axe) {
        Axe = axe;
    }

    public Druid(int attack, int defense, String axe) {
        this.attack = attack;
        this.defense = defense;
        Axe = axe;
    }
}
