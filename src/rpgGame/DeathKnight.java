package rpgGame;

public class DeathKnight {
    private int attack;
    private int defense;
    private int magicPower;
    private String weapon;

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

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "DeathKnight{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", magicPower=" + magicPower +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public DeathKnight(int attack, int defense, int magicPower, String weapon) {
        this.attack = attack;
        this.defense = defense;
        this.magicPower = magicPower;
        this.weapon = weapon;
    }

    public static void main(String[] args) {
        System.out.println("Test area");
    }
}
