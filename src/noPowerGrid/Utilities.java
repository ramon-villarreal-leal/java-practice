package noPowerGrid;

public class Utilities {
    private int electricity;
    private int gallonsOfWater;
    private String backPack;


    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getGallonsOfWater() {
        return gallonsOfWater;
    }

    public void setGallonsOfWater(int gallonsOfWater) {
        this.gallonsOfWater = gallonsOfWater;
    }

    public String getBackPack() {
        return backPack;
    }

    public void setBackPack(String backPack) {
        this.backPack = backPack;
    }

    public Utilities(int electricity, int gallonsOfWater, String backPack) {
        this.electricity = electricity;
        this.gallonsOfWater = gallonsOfWater;
        this.backPack = backPack;
    }
}
