package rpgGame;

public class Wizard {
    private int damage;
    private String Wand;
    private String Staff;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWand() {
        return Wand;
    }

    public void setWand(String wand) {
        Wand = wand;
    }

    public String getStaff() {
        return Staff;
    }

    public void setStaff(String staff) {
        Staff = staff;
    }

    public Wizard(int damage, String wand, String staff) {
        this.damage = damage;
        Wand = wand;
        Staff = staff;
    }
}
