package rpgGame;

public class Magic {
    private int buffs;
    private int debuffs;
    private int curse;

    public int getBuffs() {
        return buffs;
    }

    public void setBuffs(int buffs) {
        this.buffs = buffs;
    }

    public int getDebuffs() {
        return debuffs;
    }

    public void setDebuffs(int debuffs) {
        this.debuffs = debuffs;
    }

    public Magic(int buffs, int debuffs, int curse) {
        this.buffs = buffs;
        this.debuffs = debuffs;
        this.curse = curse;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }
}
