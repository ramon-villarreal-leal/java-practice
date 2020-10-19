package rpgGame;

public class Weapon {
    private int sword;
    private int axe;
    private int magicWand;
    private int mace;
    private int upgradeWeapon;
    private int weaponDamage;


    public int getUpgradeWeapon() {
        return upgradeWeapon;
    }

    public void setUpgradeWeapon(int upgradeWeapon) {
        this.upgradeWeapon = upgradeWeapon;
    }

    public int getSword() {
        return sword;
    }

    public void setSword(int sword) {
        this.sword = sword;
    }

    public int getAxe() {
        return axe;
    }

    public void setAxe(int axe) {
        this.axe = axe;
    }

    public int getMagicWand() {
        return magicWand;
    }

    public void setMagicWand(int magicWand) {
        this.magicWand = magicWand;
    }

    public int getMace() {
        return mace;
    }

    public void setMace(int mace) {
        this.mace = mace;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}
