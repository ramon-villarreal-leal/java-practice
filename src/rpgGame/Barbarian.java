package rpgGame;

public class Barbarian {
    private String weapons;
    private String mace;
    private String axe;


    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public String getMace() {
        return mace;
    }

    public void setMace(String mace) {
        this.mace = mace;
    }

    public String getAxe() {
        return axe;
    }

    public void setAxe(String axe) {
        this.axe = axe;
    }

    public Barbarian(String weapons, String mace, String axe) {
        this.weapons = weapons;
        this.mace = mace;
        this.axe = axe;
    }

    public static void main(String[] args) {


    }
}
