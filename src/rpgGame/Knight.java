package rpgGame;

public class Knight {
    private String lance;
    private int attack;
    private int defense;

    public String getLance() {
        return lance;
    }

    public void setLance(String lance) {
        this.lance = lance;
    }

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

    public Knight(String lance, int attack, int defense) {
        this.lance = lance;
        this.attack = attack;
        this.defense = defense;
    }
}
